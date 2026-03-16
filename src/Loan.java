import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member member;
    private LocalDate date;

    public Loan(Book book, Member member){
        this.book = book;
        this.member = member;
        date = LocalDate.now();

    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
