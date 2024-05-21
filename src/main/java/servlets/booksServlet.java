package servlets;

import java.io.IOException;
//import java.sql.SQLException;
import java.util.List;

import DAO.BookDAO;
//import DAO.UserDAO;
import beans.Book;
//import beans.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class booksServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private BookDAO bookDAO;

    public void init() {
        bookDAO = new BookDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> listBooks = bookDAO.selectAllBooks();
        
//        String message = "Books fetched: " + listBooks.size();

        request.setAttribute("listBooks", listBooks);
//        request.setAttribute("message", message);

        
        request.getRequestDispatcher("books.jsp").forward(request, response);
    }
}
