package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;
import servlets.DatabaseConnection;

public class UserDAO {
	 	private static final String INSERT_USER = "INSERT INTO users (firstName, lastName, username, email, password) VALUES (?, ?, ?, ?, ?)";
	    private static final String SELECT_USER_BY_USERNAME_PASSWORD = "SELECT count(*) FROM users WHERE username = ? AND password = ?";

//	    private static final String DELETE_USER_BY_USERID = "DELETE FROM users WHERE userID = ?";
//	    private static final String UPDATE_USER = "UPDATE users SET username = ?, password = ?, email = ?, firstName = ?, lastName = ? WHERE userID = ?";
//	    
	    
	    
	    
	    
	    //ADD USER START
	    public boolean addUser(User user) throws SQLException {
	    	try(Connection connection = DatabaseConnection.getInstance().getConnection();
	    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)){
	    		
	    		preparedStatement.setString(1, user.getFname());
	    		preparedStatement.setString(2, user.getLname());
	    		preparedStatement.setString(3, user.getUsername());
	    		preparedStatement.setString(4, user.getEmail());
	    		preparedStatement.setString(5, user.getPassword());
	    		
	    		int rowsAffected = preparedStatement.executeUpdate();
	    		
	    		System.out.print("Rows affected: " + rowsAffected);
	    		return rowsAffected > 0;
	    	}catch(SQLException e) {
	    		 e.printStackTrace();  // Print the stack trace for any SQL exceptions
	             return false;
	    	}
	    }
	    //ADD USER END
	    
	    
	    //VALIDATE USER START
	    public boolean validateUser(String username, String password) {
//	    	 // Hardcoded admin credentials
//	        String adminUsername = "Ahmed_ADMIN";
//	        String adminPassword = "xyz";  // Ideally, use a hashed password
//
//	        // Check if the credentials match the admin credentials
//	        if (adminUsername.equals(username) && adminPassword.equals(password)) {
//	            return true;  // Admin recognized
//	        }
	        try (Connection connection = DatabaseConnection.getInstance().getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_USERNAME_PASSWORD)) {
	             
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                if (resultSet.next()) {
	                    return resultSet.getInt(1) > 0;
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }
	    
	    
	    
	    
	    



}
