package servlets;


import java.io.IOException;
import java.sql.SQLException;

import DAO.UserDAO;
import beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialize the UserDAO instance
        userDAO = new UserDAO();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
        response.setContentType("text/html");

    	boolean isValidUser = userDAO.validateUser(username, password);
    	
    	if (isValidUser) {
//    		if("adminUsername".equals(username) && "adminPassword".equals(password)){
//                response.sendRedirect("Admin.jsp");
//    		}else {
    			// If the user is valid, you can redirect to a success page or do any other actions
                response.sendRedirect("Home.jsp");
//    		}
        } else {
            // If the user is not valid, you can redirect to an error page or display an error message
//            response.sendRedirect("loginError.jsp");
            response.getWriter().println("Failed to LogIn order, please try again!");

        }
    }
}
