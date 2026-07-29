<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failed!</title>
<style>

  * {
    box-sizing: border-box;
  }
 
  body {
    margin: 0;
    min-height: 100vh;
    align-items: center;
    justify-content: center;
    background: linear-gradient(135deg, #1e293b, #0f172a);
    font-family: 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
    color: #f1f5f9;
  }
 
  h1 {
    text-align: center;
    font-size: 1.8rem;
    font-weight: 600;
    margin-bottom: 2rem;
    letter-spacing: 0.02em;
  }
  
  P {
  	text-align: center;
    font-size: 22PX;
    margin-bottom: 2rem;
    letter-spacing: 0.02em;
  	
  }
  
</style>
</head>
<body>
	<%
		String email = (String) session.getAttribute("email");
	%>
	<h1>OOPs, we failed to create your account!</h1>
	<p>Account for : <%= email %> Could not be created Successfully</p>

</body>
</html>