package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.io.PrintWriter;

import DAO.OrderDAO;
import beans.Order;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addBookOrderServlet extends HttpServlet{
	 private static final long serialVersionUID = 1L;

	 private OrderDAO orderDAO;
	 

	    public void init() {
	    	orderDAO = new OrderDAO();
	    }
	    
	    

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String isbn = request.getParameter("isbn");
	        String userId = request.getParameter("userId");
		     // Set the content type of the response
		        response.setContentType("text/html");
	
		        // Get the PrintWriter object from response to write the output
		        PrintWriter out = response.getWriter();
	        boolean validate = validate(isbn, userId);
			 if(validate) {
				 Order order=new Order(isbn , userId);
				 boolean isOrderAdded;
				 try {
						isOrderAdded = orderDAO.addOrder(order);
						
						if(isOrderAdded) {
//			                response.sendRedirect("registrationSuccess.jsp");
					        out.println("Order Added Successfully!");


						}else {
//			                response.sendRedirect("registrationError.jsp");
					        out.println("Order is not added, Please try again!");


						}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 }
	    }
	    
	    public boolean validate(String isbn, String userId) {
			 return 	isbn != null && !isbn.isEmpty() 
					 && userId != null && !userId.isEmpty() ;
		 }

}
