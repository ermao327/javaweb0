<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        .odd{
            background-color: beige;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>国籍</th>
        <th>生日</th>
        <th>爱好</th>
    </tr>
    <c:forEach items="${list}" var="u" varStatus="s">
        <tr <c:if test="${s.index % 2 == 1}"> class="odd"</c:if>>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>${u.sex}</td>
            <td>${u.country}</td>
            <td>
                <fmt:formatDate value="${u.birthday}" pattern="yyyy/MM/dd"/>
             </td>
            <td>
                <c:forEach items="${u.hobbies}" var="h">
                    ${h}
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
