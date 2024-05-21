package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import DAO.OrderDAO;
import beans.Order;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deleteBookOrderServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	 private OrderDAO orderDAO;
	 

	    public void init() {
	    	orderDAO = new OrderDAO();
	    }
	    
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        int orderId = Integer.parseInt(request.getParameter("orderId"));
	        OrderDAO dao = new OrderDAO();
	        
	        boolean success = dao.deleteOrder(orderId);
	        
	        response.setContentType("text/html");
	        if (success) {
	            response.getWriter().println("Order deleted successfully.");
	        } else {
	            response.getWriter().println("Failed to delete order, please try again!");
	        }
	    }
	    
	    public boolean validate(String isbn, String userId) {
			 return 	isbn != null && !isbn.isEmpty() 
					 && userId != null && !userId.isEmpty() ;
		 }
}
