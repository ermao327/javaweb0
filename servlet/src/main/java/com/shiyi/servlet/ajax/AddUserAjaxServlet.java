package com.shiyi.servlet.ajax;

import com.shiyi.servlet.mvc.entity.User;
import com.shiyi.servlet.mvc.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "AddUserAjaxServlet", value = "/AddUserAjaxServlet")
public class AddUserAjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
                response.getWriter().print("error_username");
            }
            else {
                response.getWriter().print("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("error_system");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
