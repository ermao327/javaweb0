package com.shiyi.servlet;

import com.shiyi.servlet.mvc.util.JDBCUtil;
import com.shiyi.servlet.original.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet(name = "CheckUsernameAjaxServlet", value = "/CheckUsernameAjaxServlet")
public class CheckUsernameAjaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String username = request.getParameter("username");
        final JDBCUtil jdbcUtil = new JDBCUtil();
        try {
            final User user = jdbcUtil.queryOne("select * from userinfo where username=?", User.class, username);
            if(null != user){
                response.getWriter().write("username_error");
            }
            else{
                response.getWriter().write("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
