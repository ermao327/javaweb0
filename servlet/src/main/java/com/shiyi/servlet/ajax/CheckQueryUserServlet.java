package com.shiyi.servlet.ajax;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiyi.servlet.mvc.entity.User;
import com.shiyi.servlet.mvc.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CheckQueryUserServlet", value = "/CheckQueryUserServlet")
public class CheckQueryUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            final List<User> list = new UserService().checkquery(request.getParameter("username"));
            response.getWriter().print(new ObjectMapper().writeValueAsString(list));
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print(new ObjectMapper().writeValueAsString(new ArrayList<>()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
