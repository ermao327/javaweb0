package com.shiyi.servlet.shopcart.contoller;

import com.shiyi.servlet.shopcart.entity.User;
import com.shiyi.servlet.shopcart.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/shopcart/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        try {
            final boolean b = new UserService().checkLogin(user);
            if(b){
//                request.getRequestDispatcher("booklist.jsp").forward(request, response);
                final HttpSession session = request.getSession();
                session.setAttribute("username", user.getUsername());
                response.sendRedirect("bookquery");
            }
            else{
                request.setAttribute("info", "登录失败，用户名或者密码不正确");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("info", "登录失败，系统正忙，请稍后再试");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
