<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table>
		<tr>
			<td>Product Id</td>
			<td>Product name</td>
			<td>Product Price</td>
			<td>Action</td>
		</tr>
		<c:forEach var="p" items="${productlist}">
		<tr>
			<td>${p.pId}</td>
			<td>${p.prodName}</td>
			<td>${p.price}</td>
			<td><a href="update/${p.pId}">Update</a>/<a href="delete/${p.pId}">Delete</a></td>
		<tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>