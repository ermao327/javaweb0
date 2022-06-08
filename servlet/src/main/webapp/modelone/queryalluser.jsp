<%@ page import="java.util.Date" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.shiyi.servlet.original.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: mimi_
  Date: 2022/5/31
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;
        }
        th,td{
            border: 1px solid;
        }
    </style>
</head>
<body>
<%
    final User e1 = new User("aaa", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
    final User e2 = new User("bbb", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
    final User e3 = new User("ccc", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
    final User e4 = new User("ddd", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
    final User e5 = new User("eee", "111", "男", "中国", new Date(), new String[]{"音乐", "运动"});
    final List<User> list = List.of(e1, e2, e3, e4, e5);
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    %>
<table>
    <tr><th>用户名</th><th>密码</th><th>性别</th><th>国籍</th><th>生日</th><th>爱好</th></tr>
    <%
        for (User user : list) {
            %>
            <tr>
                <td><%=user.getUsername()%></td>
                <td><%=user.getPassword()%></td>
                <td><%=user.getSex()%></td>
                <td><%=user.getCountry()%></td>
                <td><%=f.format(user.getBirthday())%></td>
                <td><%=Arrays.toString(user.getHobbies())%></td>
            </tr>
       <%
        }%>
</table>
</body>
</html>
