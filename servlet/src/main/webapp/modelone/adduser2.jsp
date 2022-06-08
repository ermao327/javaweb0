<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.shiyi.servlet.original.User" %>
<%@ page import="java.text.ParseException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    final String username = request.getParameter("username");
    final String password = request.getParameter("password");
    final String sex = request.getParameter("sex");
    final String country = request.getParameter("country");
    final String birthday = request.getParameter("birthday");
    final String[] hobbies = request.getParameterValues("hobby");
    System.out.println(birthday);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        final User user = new User(username, password, sex, country, dateFormat.parse(birthday), hobbies);
        System.out.println(user);
        response.getWriter().print("添加成功");
    } catch (ParseException e) {
        e.printStackTrace();
        response.getWriter().print("添加失败");
    }
%>
</body>
</html>
