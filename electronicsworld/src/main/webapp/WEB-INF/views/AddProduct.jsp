<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<center>
		<url:url value="/save" var="url"></url:url>
		<form:form class="form-horizontal" role="form" action="${url }"
			modelAttribute="product">
			<div class="container">


				<h2>Add Product</h2>
				<div class="form-group">
					<label for="pId" class="col-sm-3 control-label">Enter
						Product Id</label>
					<div class="col-sm-9">
						<form:input path="pId" placeholder="Enter Product Id"
							class="form-control" />
					</div>
				</div>

			</div>



			<div class="form-group">
				<label for="prodName" class="col-sm-3 control-label">Enter
					Product Name</label>
				<div class="col-sm-9">
					<form:input path="prodName" placeholder="Enter Product Name"
						class="form-control" />
				</div>
			</div>


			<div class="container">

			<div class="form-group">
				<label for="price" class="col-sm-3 control-label">Enter
					Product Cost</label>
				<div class="col-sm-9">
					<form:input path="price" placeholder="Enter Product Cost"
						class="form-control" />
				</div>
			</div>


			<div class="form-group ">
				<button type="submit"
					class="btn btn-primary btn-lg btn-block login-button">Register</button>
			</div>
			<div class="login-register">
				<a href="#">Login</a>
			</div>
	</center>
	</form:form>
</body>
</html>