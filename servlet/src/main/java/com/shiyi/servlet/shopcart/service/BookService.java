package com.shiyi.servlet.shopcart.service;

import com.shiyi.servlet.shopcart.dao.BookDao;
import com.shiyi.servlet.shopcart.entity.Book;

import java.util.List;

public class BookService {

    private BookDao bookDao = new BookDao();

    public List<Book> queryAll() throws Exception {
        return bookDao.selectAll();
    }
}
