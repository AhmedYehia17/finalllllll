<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="beans.Book" %> <!-- Import your Book class here -->
<!DOCTYPE html>
<html>
<head>
    <title>Book List</title>
</head>
<body>
    <h1>List of Books</h1>
    
    <table border="1" width="100%">
        <tr>
            <th>ISBN</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
        </tr>
        <!--   <c:forEach var="book" items="${listBooks}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>-->
        
        
       <% 
        // Assuming 'listBooks' is a List<Book> containing your book data
        List<Book> listBooks = (List<Book>) request.getAttribute("listBooks");
        if (listBooks != null && !listBooks.isEmpty()) {
            for (Book book : listBooks) {
        %>
        <tr>
            <td><%= book.getIsbn() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPrice() %></td>        
        </tr>
        <% 
            }
        } else {
        %>
        <tr>
            <td colspan="3">No books found</td>
        </tr>
        <% } %>
    </table>
</body>
</html>
