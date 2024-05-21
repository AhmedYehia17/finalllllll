<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book Order</title>
<style>
	.purchaseBook{
		width: 100%;
		max-height: 100vh;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.purchaseBook-form{
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
	
	.purchaseBook-btn{
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
	<div class="purchaseBook">
		<h2 class="heading">Order Book</h2>
		<form action="AddBookOrder" method="post" class="purchaseBook-form">
			<label>ISBN: </label>
			<input type="text" name="isbn" required>
			
			<label>UserID: </label>
			<input type="text" name="userId" required>
		
			
			<button type="submit" class="purchaseBook-btn">Order Book</button>
		</form>
	</div>
</body>
</html>