package com.shiyi.servlet.shopcart.contoller;

import com.shiyi.servlet.shopcart.entity.Book;
import com.shiyi.servlet.shopcart.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QueryBookController", value = "/shopcart/bookquery")
public class QueryBookController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            final List<Book> books = new BookService().queryAll();
            req.setAttribute("books", books);
            req.getRequestDispatcher("booklist.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
    }
}
