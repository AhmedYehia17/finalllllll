package beans;
import java.io.Serializable;

public class Book {
	private static final long serialVersionUID = 1L;

	String isbn;
	String title;
	String author;
	String publication_date;
	String category;
	String price;
	
	public Book() {
		
	}
	
	public Book(String isbn, String title, String author, String publication_date, String category, String price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publication_date = publication_date;
		this.category = category;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
