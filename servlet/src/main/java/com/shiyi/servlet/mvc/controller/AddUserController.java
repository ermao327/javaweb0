package com.shiyi.servlet.mvc.controller;

import com.shiyi.servlet.mvc.entity.User;
import com.shiyi.servlet.mvc.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 控制层
 */
@WebServlet(name = "AddUserController", value = "/AddUserController")
public class AddUserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        final String sex = request.getParameter("sex");
        final String country = request.getParameter("country");
        final String birthday = request.getParameter("birthday");
        final String[] hobbies = request.getParameterValues("hobby");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            final User user = new User(username, password, sex, country, dateFormat.parse(birthday), hobbies);
            final boolean b = new UserService().insertOne(user);
            if(!b){
                request.setAttribute("info", "该用户名已存在，请重新注册");
                request.getRequestDispatcher("mvc/error.jsp").forward(request, response);
            }
            else {
                //请求的转发
                request.getRequestDispatcher("mvc/success.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("info", "系统正忙，请稍后再试");
            request.getRequestDispatcher("mvc/error.jsp").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
