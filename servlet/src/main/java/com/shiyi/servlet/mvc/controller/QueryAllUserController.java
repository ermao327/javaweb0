//package com.shiyi.servlet.mvc.controller;
//
//import com.shiyi.servlet.mvc.entity.User;
//import com.shiyi.servlet.mvc.service.UserService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(name = "QueryAllUserController", value = "/QueryAllUserController")
//public class QueryAllUserController extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            final List<User> list = new UserService().queryAll();
//            request.setAttribute("list", list);
//            request.getRequestDispatcher("mvc/userlist.jsp").forward(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//            request.setAttribute("info", "系统正忙，请稍后再试");
//            request.getRequestDispatcher("mvc/error.jsp").forward(request, response);
//        }
//    }
//}
