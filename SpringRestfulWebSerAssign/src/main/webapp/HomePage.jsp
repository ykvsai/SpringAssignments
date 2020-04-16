<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
<meta charset="UTF-8">
<title>Emp Management</title>
</head>
<body>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">Account Management</h1>
	<hr />
	<h2 class="text-center">Home</h2>
	<nav class="col-md-10 mx-auto alert alert-primary row">
		<div class="m-2 ">
			<a class="btn btn-secondary" href="viewall">Calculate Emi</a>
		</div>
		<div class="m-2 ">
			<a class="btn btn-secondary" href="showtransfer">Calculate Salary</a>
		</div>
		<div class="m-2 ">
			<a class="btn btn-secondary" href="showaddform">Calculate Salary</a>
		</div>
	</nav>
	<c:if test="${msg ne null }">
		<div class="col-md-4 mx-auto alert alert-success">
			${requestScope.msg}</div>
	</c:if>
</body>
</html>