<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Transfer Fund</h1>
	<nav class=" text-center">
		<a class="btn btn-dark " href="home">home</a>
	</nav>
	<h2 class="text-center">Add Account</h2>
	<c:if test="${msg ne null }">
	<div class="col-md-4 mx-auto alert alert-striped">${msg }</div>
	</c:if>
		<sf:form action="add" modelAttribute="abean" method="post">
			<table class="col-md-8 mx-auto table table-stripped">
		
			<tr>
				<td>Account ID</td>
				<td><sf:input path="accID"  type="number"/></td>
				<td><sf:errors path="accId" class="text-danger" /></td>
			</tr>
			<tr>
				<td>customer name</td>
				<td><sf:input path="custName" /></td>
				<td><sf:errors path="custName" class="text-danger" /></td>
			</tr>
			<tr>
				<td>Opening Balance</td>
				<td><sf:input path="balance"  type="number"/></td>
				<td><sf:errors path="balance" class="text-danger" /></td>
			</tr>
			
			<tr >
				<td colspan="3"></td>
				<td><input type="submit"value="save"></td>
			</tr>
	</table>
	</sf:form>
</body>
</html>