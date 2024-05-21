package beans;

public class Order {
    private String userId;
    private String isbn;

    // Constructors
    public Order() {}

    public Order(String userID , String isbn) {
    	this.userId= userID;
    	this.isbn= isbn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

