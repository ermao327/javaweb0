<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();
pageContext.setAttribute("p", path);
%>
<html>
<head>
    <title>Title</title>
    <style>
        .info{
            color: red;
        }
    </style>
</head>
<body>
<form action="${p}/shopcart/login">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <button>登录</button><br>
    <span class="info">${info}<span>
</form>
</body>
</html>
