package com.shiyi.servlet.shopcart.dao;

import com.shiyi.servlet.shopcart.entity.User;
import com.shiyi.servlet.shopcart.util.JDBCUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class UserDao {

    private JDBCUtil jdbcUtil = new JDBCUtil();

    public User selectByUsernameAndPassword(User user) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return
                jdbcUtil.queryOne("select * from userinfo where username=? and password=?",
                        User.class, user.getUsername(),user.getPassword());
    }
}
