<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/3
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="inc/inc.jsp"%>
<html>
<head>
    <title>保险</title>
</head>
<body>
<h1>欢迎登陆xx保险</h1>
<form action="${ctx}/admin/long" method="post">
    <span>用户：</span> <input type="text" name="username" value="admin"><br>
    <span>密码：</span><input type="password" name="pass"> <br>
    <input type="submit" value="登陆">
</form>
<a href="admin/index.jsp">管理员登陆</a>
</body>
</html>
