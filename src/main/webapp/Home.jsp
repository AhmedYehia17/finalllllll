<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Store</title>
<style>
*{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
	text-decoration: none;
}

.home{
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
a{
		width: fit-content;
		margin: auto;
		margin-top: 30px;
		padding: 10px;
		background-color: #FFD580;
		border-radius: 15px;
		border: none;
		color: white;
		font-size: 17px;
		text-align: center;
}
</style>
</head>
<body>
	<div class="home">
		<div class="container">
			<h1 class="heading">Welcome Back!</h1>
			<a href="books.jsp">View available books</a>
			<a href="BookOrders.jsp">Book Orders</a>
		</div>
	</div>
</body>
</html>