package com.shiyi.servlet.original;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "PreModUserServlet", value = "/PreModUserServlet")
public class PreModUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String username = request.getParameter("username");
        User user = new User(username, "111", "男",
                "法国", new Date(), new String[]{"音乐","运动","Java"});
        String maleChecked = user.getSex().equals("男")?"checked":"";
        String femaleChecked = user.getSex().equals("女")?"checked":"";
        String chinaChecked = user.getCountry().equals("中国")?"selected":"";
        String usaChecked = user.getCountry().equals("美国")?"selected":"";
        String franceChecked = user.getCountry().equals("法国")?"selected":"";
        String musicChecked = "";
        String sportChecked = "";
        String javaChecked = "";
        for (String hobby : user.getHobbies()) {
            if(hobby.equals("音乐")){
                musicChecked = "checked";
            }
            if(hobby.equals("运动")){
                sportChecked = "checked";
            }
            if(hobby.equals("Java")){
                javaChecked = "checked";
            }

        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthdayStr = dateFormat.format(user.getBirthday());
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"AddUserServlet\" method=\"post\">\n" +
                "    用户名:<input name=\"username\" type=\"text\" value=\"\"><br/>\n" +
                "    密码:<input name=\"password\" type=\"password\" value=\"\"><br>\n" +
                "    性别:<input type=\"radio\" name=\"sex\" value=\"男\" checked>男\n" +
                "    <input type=\"radio\" name=\"sex\" value=\"男\">女<br>\n" +
                "    国籍:<select name=\"country\">\n" +
                "    <option value=\"\" selected>请选择</option>\n" +
                "    <option value=\"中国\">中国</option>\n" +
                "    <option value=\"美国\">美国</option>\n" +
                "    <option value=\"法国\">法国</option>\n" +
                "</select><br>\n" +
                "    生日:<input type=\"date\" name=\"birthday\" value=\"\"><br>\n" +
                "    爱好:\n" +
                "    <input type=\"checkbox\" name=\"hobby\" value=\"音乐\">音乐\n" +
                "    <input type=\"checkbox\" name=\"hobby\" value=\"运动\">运动\n" +
                "    <input type=\"checkbox\" name=\"hobby\" value=\"Java\">Java\n" +
                "    <br>\n" +
                "    <button>提交</button>\n" +
                "    <button type=\"reset\">重置</button>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
