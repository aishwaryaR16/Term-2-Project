<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>


<br/><br/><br/>

<form action="RegisterController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="grey">
<td colspan="2">

<h2>
<font face="monotype corsiva"color="blue" size="10">Sign Up Here</font>
</h2>
</td></tr>


<tr bgcolor="grey">
<td colspan="2">

<h2 >
<font face="monotype corsiva"color="red" size="10">${errorInfo }</font>
</h2>
</td>
</tr>


<tr>
<td>Login</td>
<td> <input type="text" name="loginId" required/></td>
</tr>
<tr>

<tr>
<td>password</td>
<td> <input type="password" name="passwd" required/></td>
</tr>

<tr>
<td>Customer Name</td>
<td> <input type="text" name="customerName" required/></td>
</tr>

<tr>
<td>Email ID</td>
<td> <input type="email" name="emailId" required/></td>
</tr>

<tr>
<td>Mobile</td>
<td> <input type="text" name="mobileNo" pattern="[789]\d{9}" placeholder="Enter Mobile No of 10 digits" required/></td>
</tr>

<tr>
<td>Address</td>
<td> <textarea cols="30" rows="addr"> </textarea> </td>
</tr>

<tr>
<td>Country</td>
<td><select name="country">
<option value="India">India</option>
<option value="SriLanka">SriLanka</option>
<option value="Australia">Australia</option>
<option value="USA">USA</option>
</select></td>
</tr>

<tr bgcolor="grey">
<td colspan="2"><center>
<input type="submit" value="Sign Up"/>
</center>
</td>
</tr>
</table>
</form>
</body>
</html>
