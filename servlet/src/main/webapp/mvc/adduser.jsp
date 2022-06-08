<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%String path = request.getContextPath(); %>
</head>
<body>
<form action="<%=path%>/AddUserController" method="post">
    用户名:<input name="username" type="text" value=""><br/>
    密码:<input name="password" type="password" value=""><br>
    性别:<input type="radio" name="sex" value="男" checked>男
    <input type="radio" name="sex" value="男">女<br>
    国籍:<select name="country">
    <option value="" selected>请选择</option>
    <option value="中国">中国</option>
    <option value="美国">美国</option>
    <option value="法国">法国</option>
</select><br>
    生日:<input type="date" name="birthday" value=""><br>
    爱好:
    <input type="checkbox" name="hobby" value="音乐">音乐
    <input type="checkbox" name="hobby" value="运动">运动
    <input type="checkbox" name="hobby" value="Java">Java
    <br>
    <button>提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>
