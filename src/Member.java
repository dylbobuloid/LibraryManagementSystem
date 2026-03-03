import java.util.ArrayList;
public class Member {
    private String name;
    private int memberId;
    private ArrayList<Book> booksBorrowed = new ArrayList<>();

    public Member(String name, int id) {
        this.name = name;
        this.memberId = id;

    }

    private void borrowBook(Book book){
        booksBorrowed.add(book);
        book.bookBorrowed();
    }
}