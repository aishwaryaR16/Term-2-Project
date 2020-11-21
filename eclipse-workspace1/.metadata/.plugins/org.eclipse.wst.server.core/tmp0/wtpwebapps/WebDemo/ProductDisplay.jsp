<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="CommonHeader.jsp" %>
<br/><br/><br/><br/>

<table align="center" cellspacing="4" cellpadding="4">

<tr bgcolor="cyan">
<td>Product Id</td>
<td>Product Name</td>
<td>Price</td>
<td>Product Description</td>
<td>Stock</td>
<td>Category</td>
<td>Supplier</td>

</tr>

<c:forEach items="${productList }" var="product">
<tr bgcolor="yellow">
<td>${product.productId}</td>
<td>${product.productName}</td>
<td>${product.price}</td>
<td>${product.description}</td>
<td>${product.stock}</td>
<td>${product.category}</td>
<td>${product.supplier}</td>
<td>
<a href="DeleteProductController?productid/${product.productId}">Delete</a>

</tr>

</c:forEach>

</table>


</body>
</html>