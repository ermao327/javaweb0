package com.shiyi.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyServlet2", value = "/MyServlet2",loadOnStartup = 0,initParams = {@WebInitParam(name="param1",value = "aaa"),
@WebInitParam(name = "param2",value = "bbb")})
public class MyServlet2 extends HttpServlet {
    int count=0;
    public MyServlet2() {
        System.out.println("实例化");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        final String param1 = config.getInitParameter("param1");
        final String param2 = config.getInitParameter("param2");
        System.out.println(param1+"   "+param2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            System.out.println("工作");
            response.getWriter().print(++count);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
