<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style>
	.register{
		width: 100%;
		max-height: 100vh;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.register-form{
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
	
	.register-btn{
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
	<div class="register">
		<h2 class="heading">SignUp</h2>
		<form action="register" method="post" class="register-form">
			<label>First Name: </label>
			<input type="text" name="firstName" required>
			
			<label>Last Name: </label>
			<input type="text" name="lastName" required>
			
			<label>UserName: </label>
			<input type="text" name="userName" required>
			
			<label>Email: </label>
			<input type="email" name="email" required>
			
			<label>Password: </label>
			<input type="password" name="password" required>
			
			<button type="submit" class="register-btn">Register</button>
		</form>
	</div>
</body>
</html>