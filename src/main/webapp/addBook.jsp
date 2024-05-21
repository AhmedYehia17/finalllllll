<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<style>
	.addBook{
		width: 100%;
		max-height: 100vh;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.addBook-form{
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
	
	.addBook-btn{
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
	<div class="addBook">
		<h2 class="heading">Add Book</h2>
		<form action="addBook" method="post" class="addBook-form">
			<label>ISBN: </label>
			<input type="text" name="isbn" required>
			
			<label>Title: </label>
			<input type="text" name="title" required>
			
			<label>Author: </label>
			<input type="text" name="author" required>
			
			<label>Publication_Date: </label>
			<input type="text" name="publication_date" required>
			
			<label>Category: </label>
			<input type="text" name="category" required>
			
			<label>Price: </label>
			<input type="text" name="price" required>
			
			<button type="submit" class="addBook-btn">Add Book</button>
		</form>
	</div>
</body>
</html>