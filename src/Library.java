import java.util.ArrayList;


public class Library {
    private ArrayList<Book> booksInLibrary = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> activeLoans = new ArrayList<>();

    private void addMember(Member member) {
        members.add(member);
    }

    private void addBook(Book book) {
        booksInLibrary.add(book);
    }

    public void checkoutBook(Member member, Book book) {
        if (book.isAvailabilityStatus()) {
            book.borrow();
            Loan loan = new Loan(book, member);
            activeLoans.add(loan);
        } else {
            System.out.println("This book is not available please try another book!");
        }

    }

    public void returnBook(Member member, Book book) {
        Loan bookToRemove = null;

        for (Loan l : activeLoans) {
            if (l.getBook().equals(book)) {
                bookToRemove = l;
                break;
            }
        }

        if (bookToRemove != null) {
            book.bookReturn();  // Mark available
            activeLoans.remove(bookToRemove);  // Remove loan
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("This book wasn't borrowed!");
        }

    }

}