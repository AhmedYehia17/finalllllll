<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bookie</title>
<style>
*{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
	text-decoration: none;
}

.welcome{
	width: 100%;
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container{
	padding: 30px 50px; 
	display: flex;
	flex-direction: column;
	justfy-items: center;
	align-items: center;
	gap: 30px;
}

.heading{
	font-size: 50px;
	font-weight: bold;
}

.login , .register{
	color: #000;
	font-size: 22px;
	border: 1px solid black;
	border-radius: 20px;
	padding: 8px 20px;
}
</style>
</head>
<body>
	  <div class="welcome">
	  	<div class="container">
	  		<h2 class="heading">Welcome to our Book Store!</h2>
	  		
	  		<a href="login.jsp" class="login">Login</a>
	  		<a href="register.jsp" class="register">SignUp</a>
	  		
	  	</div>
	  </div>
	  
</body>
</html>