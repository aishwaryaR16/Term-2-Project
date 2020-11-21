
<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>

<br/><br/><br/>


<form action="ProductController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="grey">
<td colspan="2">

<h2>
<font face="monotype corsiva"color="blue" size="7">Product Info</font>
</h2>
</td></tr>


<tr bgcolor="grey">
<td colspan="2">

<h2 >
<font face="monotype corsiva"color="red" size="5">${errorInfo }</font>
</h2>
</td>
</tr>


<tr>
<td>Product Name</td>
<td> <input type="text" name="productName" required/></td>
</tr>
<tr>

<tr>
<td>Price</td>
<td> <input type="text" name="price" required/></td>
</tr>

<tr>
<td>Description</td>
<td> <input type="text" name="description" required/></td>
</tr>

<tr>
<td>Stock</td>
<td> <input type="text" name="stock" required/></td>
</tr>

<tr>
<td>Category</td>

<td><select name="category" required>
<option value="Mobile">Mobile</option>
<option value="PenDrive">PenDrive</option>
<option value="HardDisk">HardDisk</option>
<option value="Tripod">Tripod</option>
</select></td>
</tr>

<tr>
<td>Supplier</td>

<td><select name="supplier" required>
<option value="Cloud Retail">Cloud Retail</option>
<option value="ABC Inc">ABC Inc</option>
<option value="Traders">Traders</option>
<option value="Big C">Big C</option>
</select></td>
</tr>

<tr bgcolor="grey">
<td colspan="2"><center>
<input type="submit" value="Get Info"/>
</center>
</td>
</tr>
</table>
</form>
</body>
</html>
