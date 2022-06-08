<%@ page import="java.util.Date" %>
<%@ page import="com.shiyi.servlet.original.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
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
%>
<form action="adduser2.jsp" method="post">
    用户名:<input name="username" type="text" value="<%=user.getUsername()%>"><br/>
    密码:<input name="password" type="password" value="<%=user.getPassword()%>"><br>
    性别:<input type="radio" name="sex" value="男" <%=maleChecked %> >男
    <input type="radio" name="sex" value="女" <%=femaleChecked %>>女<br>
    国籍:<select name="country">
    <option value="" selected>请选择</option>
    <option value="中国" <%=chinaChecked %>>中国</option>
    <option value="美国" <%=usaChecked %>>美国</option>
    <option value="法国" <%=franceChecked %>>法国</option>
</select><br>
    生日:<input type="date" name="birthday" value="<%=birthdayStr%>"><br>
    爱好:
    <input type="checkbox" name="hobby" value="音乐" <%=musicChecked %>>音乐
    <input type="checkbox" name="hobby" value="运动" <%=sportChecked %>>运动
    <input type="checkbox" name="hobby" value="Java" <%=javaChecked %>>Java
    <br>
    <button>提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>
