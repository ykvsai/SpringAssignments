<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMI Calculation</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 align="center">Tax calculation</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div>
<hr/>
<form action="emisubmit">
	<table class="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Customer Name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Loan Amount</td>
			<td>${param.txtamt}</td>
		</tr>
		<tr>
			<td>Years</td>
			<td>${param.txtyears}</td>
		</tr>
		<tr>
			<td>Years</td>
			<td>${requestScope.totalamt}</td>
		</tr>
		<tr>
			<td>Years</td>
			<td>${requestScope.monthlyamt}</td>
		</tr>
		
	</table>
</form>
</body>
</html>