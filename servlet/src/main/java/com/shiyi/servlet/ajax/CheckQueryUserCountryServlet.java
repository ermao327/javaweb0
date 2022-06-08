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

@WebServlet(name = "CheckQueryUserCountryServlet", value = "/CheckQueryUserCountryServlet")
public class CheckQueryUserCountryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int m;
            final String page1 = request.getParameter("page");
            final String country = request.getParameter("country");
            int page=Integer.parseInt(page1);
            if(page==1){
                m=0;
            }
            else {
                m=(page-1)*3;
            }
            final List<User> list = new UserService().checkqueryCountry(country,m,3);
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
