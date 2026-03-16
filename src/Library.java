import java.util.ArrayList;
import java.util.Scanner;


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

    public void searchBook(String searchEntry) {
        System.out.println("What would you like to search using?");
        System.out.println("(1) Author (2) Title (3) ISBN");

        Scanner scanner = new Scanner(System.in);
        boolean operationComplete = false;

        while (!operationComplete) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid choice");
                scanner.nextLine();
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1){
                StringBuilder matchingBooks = new StringBuilder("<----BOOKS---->");
                for(Book b: booksInLibrary){
                    if (b.getAuthor().contains(searchEntry)){
                        matchingBooks.append("\n").append(b.toString());
                    }
                }
                System.out.println(matchingBooks);
            } else if (option == 2) {
                StringBuilder matchingBooks = new StringBuilder("<----BOOKS---->");
                for(Book b: booksInLibrary){
                    if (b.getTitle().contains(searchEntry)){
                        matchingBooks.append("\n").append(b.toString());
                    }

                }
                System.out.println(matchingBooks);

            } else if (option == 3) {
                StringBuilder matchingBooks = new StringBuilder("<----BOOKS---->");
                for(Book b: booksInLibrary){
                    if (String.valueOf(b.getISBN()).contains(searchEntry)){
                        matchingBooks.append("\n").append(b.toString());
                    }
                }
                System.out.println(matchingBooks);
            }
            operationComplete = true;
        }
    }

}