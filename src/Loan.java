import java.time.LocalDate;

public class Loan {
    private String name;
    private Member member;
    private LocalDate date;

    public Loan(String name, Member member){
        this.name = name;
        this.member = member;
        date = LocalDate.now();

    }



}
