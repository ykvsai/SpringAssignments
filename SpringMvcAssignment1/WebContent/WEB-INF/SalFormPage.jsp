<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary Calculation</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 align="center">Salary Calculation</h1>
<div class="col-md-10 text-right"><a class="btn btn-danger" href="home">Home</a></div>
<hr/>
<form action="calcsal">
	<table class="col-md-4 table table-striped mx-auto">
		<tr>
			<td>Employee ID</td>
			<td><input type="number" name="eid" required /></td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td><input type="text" name="ename" required /></td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td><input type="number" name="sal" required /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Calc Salary" /></td>
		</tr>
	</table>
</form>
</body>
</html>