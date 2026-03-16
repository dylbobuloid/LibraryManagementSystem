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

    public void borrow(){
        this.availabilityStatus = false;
    }

    public void bookReturn(){
        this.availabilityStatus = true;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + String.valueOf(ISBN);
    }
}
