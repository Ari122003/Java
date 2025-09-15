package Books;
import java.time.LocalDate;
public class Book {

    private String bookId;
    private int quantity;

    private String name;
    private String category;
    private String author;
    private int price;


    public Book(String bookId , int quantity,String category,String name, String author, int price) {

        this.bookId = bookId;
        this.quantity = quantity;
        this.category = category;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getCategory(){
        return this.category;
    }


    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
}
