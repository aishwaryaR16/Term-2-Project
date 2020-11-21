<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="LoginController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="grey">
<td colspan="2">
<h2> <font face="Monotype Corsiva">Sign Up Here</font></h2>


</td></tr>
<tr>
<td>Login</td>
<td> <input type="text" name="loginId" required/></td>
</tr>
<tr>

<tr>
<td>Password</td>
<td> <input type="password" name="passwd" required/></td>
</tr>
<tr>

<tr bgcolor="grey">
<td colspan="2">

<input type="submit" value="Sign Up"/>


</td></tr>

</table></form>
</body>
</html>