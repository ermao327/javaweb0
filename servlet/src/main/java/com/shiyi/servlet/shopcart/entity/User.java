package com.shiyi.servlet.shopcart.entity;

import java.util.Arrays;
import java.util.Date;

public class User {
    private String  username;

    private String password;

    private String sex;

    private String country;

    private Date birthday;

    private String[] hobbies;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", birthday=" + birthday +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public User(String username, String password, String sex, String country, Date birthday, String[] hobbies) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.country = country;
        this.birthday = birthday;
        this.hobbies = hobbies;
    }

    public User() {
    }
}
