import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member member;
    private LocalDate date;
    private LocalDate dueDate;

    public Loan(Book book, Member member){
        this.book = book;
        this.member = member;
        date = LocalDate.now();
        dueDate = LocalDate.now().plusDays(7);

    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public boolean checkIfOverdue(){
        return LocalDate.now().isAfter(dueDate);
    }
}
