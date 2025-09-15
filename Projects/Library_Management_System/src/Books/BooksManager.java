package Books;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BooksManager {
    private List<Book> bookStorage = new ArrayList<>();


    public void addBook(String bookId , int quantity,String category,String name, String author, int price){
        Book book = new Book(bookId , quantity, category, name, author, price);
        bookStorage.add(book);
    }

    public void issueBook(String bookId ){


        for(Book book : bookStorage){
            if(book.getBookId() == bookId){

                 book.setQuantity(book.getQuantity()-1);
                 return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(String bookId ){
        for(Book book : bookStorage){
            if(book.getBookId() == bookId){

                book.setQuantity(book.getQuantity()+1);
                return;
            }
        }

        System.out.println("Book not found");
    }

    public Book searchBook(String name){

        for(Book book : bookStorage){
            if(book.getName()==name){
                return book;
            }
        }
        return null;
    }

  public void showAllBooks() {
      System.out.println("BookId | Name        | Author      | Category   | Price | Quantity");
      System.out.println("---------------------------------------------------------------");
      for (Book book : bookStorage) {
          System.out.printf("%6d | %-11s | %-11s | %-10s | %5d | %8d\n",
              book.getBookId(),
              book.getName(),
              book.getAuthor(),
              book.getCategory(),
              book.getPrice(),
              book.getQuantity()
          );
      }
  }
}
