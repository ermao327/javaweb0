package com.shiyi.servlet.shopcart.service;

import com.shiyi.servlet.shopcart.dao.UserDao;
import com.shiyi.servlet.shopcart.entity.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class UserService {
    private UserDao userDao = new UserDao();

    public boolean checkLogin(User user) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final User user1 = userDao.selectByUsernameAndPassword(user);
        if(null == user1)
            return false;
        return true;
    }
}
