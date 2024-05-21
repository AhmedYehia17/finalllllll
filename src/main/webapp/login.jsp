<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
<style>
.login{
		width: 100%;
		max-height: 100vh;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.login-form{
		display: flex;
		flex-direction: column;
		gap: 10px;
	}
	
	label{
		font-size: 22px;
		font-weight: bold;
	}
	
	input{
		width: 250px;
		height: 15px;
		border-radius: 15px;
		outline: none;
		border: 1px solid #000;
		padding: 7px;
	}
	
	.login-btn{
		width: 50%;
		margin: auto;
		margin-top: 30px;
		padding: 10px;
		background-color: #FFD580;
		border-radius: 15px;
		border: none;
		color: white;
		font-size: 17px;
		cursor: pointer;
	}
	.heading{
	font-size: 30px;
	font-weight: bold;
	}
</style>
</head>
<body>
	<div class="login">
		<h2 class="heading">LogIn</h2>
		<form action="login" method="post" class="login-form">
			<label>UserName: </label>
			<input type="text" name="username" required>
			
			<label>Password: </label>
			<input type="text" name="password" required>
			
			
			<button type="submit" class="login-btn">LogIn</button>
			<p>Don't have an account? <a href="register.jsp">Create Account</a></p>
		</form>
	</div>
</body>
</html>