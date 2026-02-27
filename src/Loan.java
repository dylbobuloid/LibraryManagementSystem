import java.util.ArrayList;
public class Loan {
    private String name;
    private  int id;
    private ArrayList<Book> booksBorrowed = new ArrayList<>();

    public Loan(String name, int id){
        this.name = name;
        this.id = id;

    }



}
