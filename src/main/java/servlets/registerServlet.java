package servlets;

import java.io.IOException;
import java.sql.SQLException;

import DAO.UserDAO;
import beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	 
	 private UserDAO userDAO = new UserDAO();
	 
	 public void init() throws ServletException {
		 super.init();
		 userDAO = new UserDAO();
	 }
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
        response.setContentType("text/html");

		
		boolean validate= validate(firstName, lastName, userName, email, password);
		if(validate) {
			User user = new User(firstName, lastName, userName, email, password);
			boolean isUserAdded;
			try {
						isUserAdded = userDAO.addUser(user);
						
						if(isUserAdded) {
			                response.sendRedirect("Home.jsp");

						}else {
//			                response.sendRedirect("registrationError.jsp");
				            response.getWriter().println("Failed to Register order, please try again!");


						}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		

	 }
	 
	 public boolean validate(String firstName, String lastName, String userName, String email, String password) {
		 return firstName != null && !firstName.isEmpty() 
				 && lastName != null && !lastName.isEmpty() 
				 && userName != null && !userName.isEmpty()
				 && email != null && !email.isEmpty()
				 && password != null && !password.isEmpty();
	 }

}
