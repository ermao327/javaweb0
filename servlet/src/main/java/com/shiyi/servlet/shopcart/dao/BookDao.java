package com.shiyi.servlet.shopcart.dao;

import com.shiyi.servlet.shopcart.entity.Book;
import com.shiyi.servlet.shopcart.util.JDBCUtil;

import java.util.List;

public class BookDao {
    JDBCUtil jdbcUtil = new JDBCUtil();

    public List<Book> selectAll() throws Exception {
        return jdbcUtil.queryMany("select * from bookinfo",
                Book.class );
    }
}
