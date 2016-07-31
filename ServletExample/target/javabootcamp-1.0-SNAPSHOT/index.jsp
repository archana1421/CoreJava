<%--
  Created by IntelliJ IDEA.
  User: armanchi
  Date: 7/19/2016
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login Page</title>
</head>

<h2>Hello, please log in:</h2>
<br><br>

<form action="LoginServlet" method="post">
  Name:<input type="text" name="username"/><br/><br/>
  Password:<input type="password" name="userpass"/><br/><br/>
  <input type="submit" value="login"/>
</form>

</html>
