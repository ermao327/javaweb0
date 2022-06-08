package com.shiyi.servlet.mvc.dao;

import com.shiyi.servlet.mvc.entity.User;
import com.shiyi.servlet.mvc.util.JDBCUtil;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class UserDao {
    JDBCUtil jdbcUtil = new JDBCUtil();

    public void insertOne(User user) throws SQLException, ClassNotFoundException {
        final String hobbyStr = Arrays.toString(user.getHobbies());
        jdbcUtil.update("insert into userinfo values(?,?,?,?,?,?)",
                user.getUsername(),
                user.getPassword(),
                user.getSex(),
                user.getCountry(),
                user.getBirthday(),
                hobbyStr.substring(hobbyStr.indexOf("[")+1,hobbyStr.indexOf("]")));
    }

    public User selectByUsername(String username) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return
                jdbcUtil.queryOne("select * from userinfo where username=?",
                        User.class, username);
    }
    public List<User> queryAll(int m,int n) throws Exception {
        return jdbcUtil.queryMany("select * from userinfo limit "+m+","+n+"   ", User.class)  ;
    }
    public List<User> queryColumn() throws Exception {
        return jdbcUtil.queryMany("select count(*) from userinfo ", User.class)  ;
    }
    public List<User> checkquery(String username) throws Exception {
        return jdbcUtil.queryMany("select * from userinfo where username=?", User.class,username);
    }
    public List<User> checkquerySex(String sex,int m,int n) throws Exception {
        return jdbcUtil.queryMany("select * from userinfo where sex=? limit "+m+","+n+"", User.class,sex);
    }
    public List<User> checkqueryCountry(String country,int m,int n) throws Exception {
        return jdbcUtil.queryMany("select * from userinfo where country=? limit "+m+","+n+"", User.class,country);
    }
}
