package com.shiyi.servlet.ajax;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiyi.servlet.mvc.entity.User;
import com.shiyi.servlet.mvc.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PreModUserAjaxServlet", value = "/PreModUserAjaxServlet")
public class PreModUserAjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            final User user = new UserService().queryByUserName(request.getParameter("username"));
            response.getWriter().print(new ObjectMapper().writeValueAsString(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
