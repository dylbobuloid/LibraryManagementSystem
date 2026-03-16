import java.util.ArrayList;
public class Member {
    private String name;
    private int memberId;
    private ArrayList<Book> booksBorrowed = new ArrayList<>();

    public Member(String name, int id) {
        this.name = name;
        this.memberId = id;

    }

    public void borrowBook(Book book){
        if(book.isAvailabilityStatus()) {
            booksBorrowed.add(book);
            book.borrow();
        }else{
            System.out.println("That book is not available to borrow");
            System.out.println("Please try another book.");
        }
    }

    public void returnBook(Book book){
        book.bookReturn();
        booksBorrowed.remove(book);
    }

    public String getName() {
        return name;
    }
}