package com.shiyi.servlet.mvc.service;

import com.shiyi.servlet.mvc.dao.UserDao;
import com.shiyi.servlet.mvc.entity.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    UserDao userDao = new UserDao();

    public boolean insertOne(User user) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final User result = userDao.selectByUsername(user.getUsername());
        if(result != null){
            return false;
        }
        userDao.insertOne(user);
        return true;
    }
    public User queryByUserName(String username) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return userDao.selectByUsername(username);
    }
    public List<User> queryAll(int m,int n) throws Exception {
        return userDao.queryAll(m,n);
    }
    public List<User> queryColumn() throws Exception {
        return userDao.queryColumn();
    }
    public List<User> checkquery(String username) throws Exception {
        return userDao.checkquery(username);
    }
    public List<User> checkquerySex(String sex,int m,int n) throws Exception {
        return userDao.checkquerySex(sex,m,n);
    }
    public List<User> checkqueryCountry(String country,int m,int n) throws Exception {
        return userDao.checkqueryCountry(country,m,n);
    }
}
