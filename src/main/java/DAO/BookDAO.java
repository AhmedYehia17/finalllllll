package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Book;
import servlets.DatabaseConnection;

public class BookDAO {
 	private static final String INSERT_BOOK = "INSERT INTO books (isbn, title, author, publication_date, category, price) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_BOOK = "UPDATE books SET isbn = ?, title = ?, author = ?, publication_date = ?,category = ?, price = ? WHERE isbn = ?";
    private static final String DELETE_BOOK_BY_ISBN = "DELETE FROM books WHERE isbn = ?";
    private static final String SELECT_ALL_BOOKS = "SELECT * FROM books";
 	
 	
 	//ADD BOOK START
    public boolean addBook(Book book) throws SQLException {
    	try(Connection connection = DatabaseConnection.getInstance().getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK)){
    		
    		preparedStatement.setString(1, book.getIsbn());
    		preparedStatement.setString(2, book.getTitle());
    		preparedStatement.setString(3, book.getAuthor());
    		preparedStatement.setString(4, book.getPublication_date());
    		preparedStatement.setString(5, book.getCategory());
    		preparedStatement.setString(6, book.getPrice());

    		
    		int rowsAffected = preparedStatement.executeUpdate();
    		
    		System.out.print("Rows affected: " + rowsAffected);
    		return rowsAffected > 0;
    	}catch(SQLException e) {
    		 e.printStackTrace();  // Print the stack trace for any SQL exceptions
             return false;
    	}
    }
    //ADD BOOK END
    
    
    
  //UPDATE BOOK START
    public boolean updateBook(Book book) throws SQLException {
    	try(Connection connection = DatabaseConnection.getInstance().getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BOOK)){
    		
    		preparedStatement.setString(1, book.getIsbn());
    		preparedStatement.setString(2, book.getTitle());
    		preparedStatement.setString(3, book.getAuthor());
    		preparedStatement.setString(4, book.getPublication_date());
    		preparedStatement.setString(5, book.getCategory());
    		preparedStatement.setString(6, book.getPrice());
    		preparedStatement.setString(7, book.getIsbn());

    		
    		int rowsAffected = preparedStatement.executeUpdate();
    		
    		System.out.print("Rows affected: " + rowsAffected);
    		return rowsAffected > 0;
    	}catch(SQLException e) {
    		 e.printStackTrace();  // Print the stack trace for any SQL exceptions
             return false;
    	}
    }
    //UPDATE BOOK END
    
    
    //DELETE BOOK  START
    public boolean deleteBook(Book book) {
        try (Connection connection = DatabaseConnection.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BOOK_BY_ISBN)) {

            preparedStatement.setString(1, book.getIsbn());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //DELETE BOOK END
    
    
    
  //RETRIEVE BOOK  START
    public List<Book> selectAllBooks() {
    	List<Book> books=new ArrayList<>();
        try (Connection connection = DatabaseConnection.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOKS)) {
               

        	 ResultSet rs = preparedStatement.executeQuery();

             while (rs.next()) {
                 String isbn = rs.getString("isbn");
                 String title = rs.getString("title");
                 String author = rs.getString("author");
                 String publication_date = rs.getString("publication_date");
                 String category = rs.getString("category");
                 String price = rs.getString("price");

                 books.add(new Book( isbn,  title,  author,  publication_date,  category,  price));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
        System.out.println("Books fetched: " + books.size()); // Add this line

         return books;
        }
    }
    //RETRIEVE BOOK END

