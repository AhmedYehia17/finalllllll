package servlets;

import java.io.IOException;
import java.sql.SQLException;

import DAO.BookDAO;
import DAO.UserDAO;
import beans.Book;
import beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deleteBookServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 
	 private BookDAO bookDAO = new BookDAO();
	 
	 
	 
	 public void init() throws ServletException {
		 super.init();
		 bookDAO = new BookDAO();
	 }
	 
	 protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
		 	String isbn = request.getParameter("isbn");
		 	String title = request.getParameter("title");
			 String author = request.getParameter("author");
			 String publication_date = request.getParameter("publication_date");
			 String category = request.getParameter("category");
			 String price = request.getParameter("price");
		        response.setContentType("text/html");

			 
			 boolean validate = validate(isbn , title, author, publication_date, category, price);
			 if(validate) {
				 Book book=new Book(isbn , title, author, publication_date, category, price);
				 boolean isBookDeleted;
				 isBookDeleted = bookDAO.deleteBook(book);
					
					if(isBookDeleted) {
//				        response.sendRedirect("BookDeletedSuccess.jsp");
			            response.getWriter().println("Book Deleted Successfuly");


					}else {
//				        response.sendRedirect("BookDeleteError.jsp");
			            response.getWriter().println("Book is not deleted, please try again!");


					}
			 }
	        
	 }
	 
	 
	 public boolean validate(String isbn, String title, String author, String publication_date, String category, String price) {
		 return isbn != null && !isbn.isEmpty() 
				 && title != null && !title.isEmpty() 
				 && author != null && !author.isEmpty()
				 && publication_date != null && !publication_date.isEmpty()
				 && category != null && !category.isEmpty()
				 && price != null && !price.isEmpty();
	 }
}
