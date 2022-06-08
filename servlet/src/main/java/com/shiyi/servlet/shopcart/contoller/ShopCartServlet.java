package com.shiyi.servlet.shopcart.contoller;
import com.shiyi.servlet.shopcart.entity.Book;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet(name = "ShopCartServlet", value = "/shopcart/cart")
public class ShopCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Integer id = Integer.valueOf(request.getParameter("id"));
        final String title = request.getParameter("title");
        final String author = request.getParameter("author");
        final String pub = request.getParameter("pub");
        final String priceStr = request.getParameter("price");
        final String img = request.getParameter("img");
        final double price = Double.parseDouble(priceStr);
        final Book book = new Book(id, title, author, pub, price, img);
        final HttpSession session = request.getSession();
        Map<Book,Integer> bookMap = (Map)session.getAttribute("bookmap");
        if(null == bookMap){
            bookMap = new LinkedHashMap<>();
            session.setAttribute("bookmap", bookMap);
        }
        bookMap.put(book, bookMap.get(book)==null?1:bookMap.get(book)+1);
        request.getRequestDispatcher("cartlist.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
