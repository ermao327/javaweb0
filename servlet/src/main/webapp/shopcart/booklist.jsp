<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path = request.getContextPath();
    pageContext.setAttribute("p", path);
%>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            float: left;
            border: 1px solid papayawhip;
        }
        input[type=text]{
            border-style: none;
        }
    </style>
</head>
<body>
<c:forEach items="${books}" var="b">
<div>
    <form action="${p}/shopcart/cart">
        <input type="hidden" name="id" value="${b.id}">
        <input type="hidden" name="img" value="${b.img}">
    <img src="${p}/${b.img}"><br>
    书名:<input type="text" name="title" value="${b.title}" readonly><br>
    作者: <input type="text" name="author" value="${b.author}" readonly><br>
    出版社:<input type="text" name="pub" value="${b.pub}" readonly><br>
    价格:<input type="text" name="price" value="${b.price}" readonly><br>
    <button>加入购物车</button>
    </form>
</div>
</c:forEach>
</body>
</html>
