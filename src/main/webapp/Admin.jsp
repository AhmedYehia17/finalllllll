<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Panel</title>
<style>
*{
	padding: 0;
	margin: 0;
	box-sizing: border-box;	
	text-decoration: none;
}
.admin{
	width: 100%;
	height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	over-flow: hidden;
}
.container{
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	gap: 30px;
}
.menu-items{
	list-style: none;
	padding: 10px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	gap: 30px;
}
a{
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
</style>
</head>
<body>
	<div class="admin">
		<div class="container">
			<h1>Welcome back admin!</h1>
			<ul class="menu-items">
				<li><a href="addBook.jsp">Add Book</a></li>
				<li><a href="updateBook.jsp">Update Book</a></li>
				<li><a href="deleteBook.jsp">Delete Book</a></li>
			</ul>
		</div>
	</div>
</body>
</html>