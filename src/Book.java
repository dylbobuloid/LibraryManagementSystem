import java.security.PrivateKey;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private boolean availabilityStatus;

    public Book(String title, String author, int isbn, boolean availabilityStatus){
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.availabilityStatus = true;
    }

}
