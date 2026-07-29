<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failed!</title>
</head>
<body>
	<%
		String email = (String) session.getAttribute("email");
	%>
	<h1>OOPs, we failed to create your account!</h1>
	<p>Account for : <%= email %> Could not be created Successfully</p>

</body>
</html>