package com.shiyi.servlet.original;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet(name = "QueryAllUserServlet", value = "/QueryAllUserServlet")
public class QueryAllUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final User e1 = new User("aaa", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
        final User e2 = new User("bbb", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
        final User e3 = new User("ccc", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
        final User e4 = new User("ddd", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
        final User e5 = new User("eee", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
        final List<User> list = List.of(e1, e2, e3, e4, e5);
        response.setContentType("text/html;charset=utf-8");
        final PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                " <style>\n" +
                "        table{\n" +
                "            border-collapse: collapse;\n" +
                "        }\n" +
                "        th,td{\n" +
                "            border: 1px solid;\n" +
                "        }\n" +
                "    </style>"+
                "</head>\n" +
                "<body>\n");
        out.write("<table>");
        out.write("<tr><th>用户名</th><th>密码</th><th>性别</th><th>国籍</th><th>生日</th><th>爱好</th></tr>");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (User user : list) {
            out.write("<tr>");
            out.write("<td>");
            out.write(user.getUsername());
            out.write("</td>");
            out.write("<td>");
            out.write(user.getPassword());
            out.write("</td>");
            out.write("<td>");
            out.write(user.getSex());
            out.write("</td>");
            out.write("<td>");
            out.write(user.getCountry());
            out.write("</td>");
            out.write("<td>");
            out.write(dateFormat.format(user.getBirthday()));
            out.write("</td>");
            out.write("<td>");
            String hobbiesStr = Arrays.toString(user.getHobbies());
            out.write(hobbiesStr.substring(hobbiesStr.indexOf("[") + 1, hobbiesStr.indexOf("]")));
            out.write("</td>");
            out.write("</tr>");
        }
        out.write("</table>");
        out.write("</body>");
        out.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
