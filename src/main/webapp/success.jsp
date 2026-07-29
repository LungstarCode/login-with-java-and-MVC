<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<%
		
		String name = (String) session.getAttribute("name");
		String email = (String) session.getAttribute("email");
	
	%>
	<h1>Congratulations <%= name %></h1>
	<p>An account was created successfully with the following email: <%= email %></p>
	
</body>
</html>