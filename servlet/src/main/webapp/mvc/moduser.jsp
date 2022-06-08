<%@ page import="com.shiyi.servlet.mvc.entity.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%String path = request.getContextPath(); %>
    <%
        User user = (User) request.getAttribute("user");
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String birthdayStr = f.format(user.getBirthday());
        pageContext.setAttribute("b", birthdayStr);
        String hobbyStr = Arrays.toString(user.getHobbies());
        pageContext.setAttribute("h", hobbyStr);
        System.out.println(birthdayStr);
    %>
</head>
<body>
<form action="<%=path%>/AddUserController" method="post">
    用户名:<input name="username" type="text" value="${user.username}"><br/>
    密码:<input name="password" type="password" value="${user.password}"><br>
    性别:<input type="radio" name="sex" value="男" <c:if test="${user.sex == '男'}">checked</c:if>>男
    <input type="radio" name="sex" value="女" <c:if test="${user.sex == '女'}">checked</c:if>>女<br>
    国籍:<select name="country">
    <option value="" selected>请选择</option>
    <option value="中国" <c:if test="${user.country == '中国'}">selected</c:if>>中国</option>
    <option value="美国" <c:if test="${user.country == '美国'}">selected</c:if>>美国</option>
    <option value="法国" <c:if test="${user.country == '法国'}">selected</c:if>>法国</option>
</select><br>
    生日:<input type="date" name="birthday" value="${pageScope.b}"><br>
    爱好:
    <input type="checkbox" name="hobby" value="音乐" <c:if test="${h.indexOf('音乐') != -1}">checked</c:if>>音乐
    <input type="checkbox" name="hobby" value="运动" <c:if test="${h.indexOf('运动') != -1}">checked</c:if>>运动
    <input type="checkbox" name="hobby" value="Java" <c:if test="${h.indexOf('Java') != -1}">checked</c:if>>Java
    <br>
    <button>提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>
