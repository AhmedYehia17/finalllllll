package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Book;
import beans.Order;
import servlets.DatabaseConnection;

public class OrderDAO {
    private static final String INSERT_ORDER_DETAILS = "INSERT INTO orders (userId, isbn) VALUES (?, ?)";
    private static final String sql = "DELETE FROM orders WHERE orderID = ?";

    //ADD ORDER START
    public boolean addOrder(Order order) throws SQLException, SQLException {
        try (Connection connection = DatabaseConnection.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ORDER_DETAILS)) {
            preparedStatement.setString(1, order.getIsbn());
        	preparedStatement.setString(2, order.getUserId());
        	
            int rowsAffected = preparedStatement.executeUpdate();
    		
    		System.out.print("Rows affected: " + rowsAffected);
    		return rowsAffected > 0;
    	}catch(SQLException e) {
    		 e.printStackTrace();  // Print the stack trace for any SQL exceptions
             return false;
    	}
    }
    //ADD ORDER END
    
    
  //DELETE ORDER  START
//    public boolean deleteOrder(Order order) {
//        try (Connection connection = DatabaseConnection.getInstance().getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ORDER_BY_ISBN_USERID)) {
//
//            preparedStatement.setString(1, order.getIsbn());
//            preparedStatement.setString(2, order.getUserId());
//
//
//            int rowsAffected = preparedStatement.executeUpdate();
//    		System.out.print("Rows affected: " + rowsAffected);
//
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    //DELETE ORDER END
    
    
    public boolean deleteOrder(int orderId) {
        try (Connection connection = DatabaseConnection.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        	 
        	preparedStatement.setInt(1, orderId);
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0; // Returns true if at least one row was deleted
        } catch (SQLException e) {
            e.printStackTrace(); // Log exception to understand what went wrong
            return false;
        }
    }
}
