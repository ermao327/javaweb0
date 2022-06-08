<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path = request.getContextPath();
    pageContext.setAttribute("p", path);
%>
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
<table>
    <caption>购物车列表</caption>
    <tr><td>封面</td><td>书名</td><td>作者</td><td>出版社</td><td>价格</td><td>数量</td></tr>
    <c:forEach items="${bookmap}" var="e">
        <tr>
            <td><img  src="${p}/${e.key.img}"></td>
            <td>${e.key.title}</td>
            <td>${e.key.author}</td>
            <td>${e.key.pub}</td>
            <td>${e.key.price}</td>
            <td><button>+</button><input type="text" value="${e.value}" size="3"><button>-</button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
