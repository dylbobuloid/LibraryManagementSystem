import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Library library = new Library();

        // Hardcode some books
        Book book1 = new Book("1984", "George Orwell", 12345, true);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 67890, true);
        library.addBook(book1);
        library.addBook(book2);

// Hardcode some members
        Member member1 = new Member("Dylan", 1);
        library.addMember(member1);

        while(running){
            System.out.println("Hi, What would you like to do?");
            System.out.println("1. Checkout Books 2. Search Books 3. View Member's borrowed Books 4. View available books 5. Track Overdue Books 6. Exit");

            if(!scanner.hasNextInt()){
                System.out.println("Please enter a valid choice");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.println("CHECKOUT BOOK");
                library.checkoutBook(member1, book1);
            } else if(choice == 2){
                library.searchBook("Harry");
                library.searchBook("Rowling");

            }else if(choice == 3) {
                library.viewMembersBooks(member1);
            }else if(choice ==4){
                library.viewAvailableBooks();
            }else if(choice == 5){
                library.checkOverdue();
            }else if(choice == 6) {
                running = false;
                System.out.println("Goodbye!");
            }

        }
    }

}
