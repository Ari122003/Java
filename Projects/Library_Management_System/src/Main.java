import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void displayMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. Search Book");
        System.out.println("5. Show All Books");
        System.out.println("6. Add Student");
        System.out.println("7. Show All Students");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);


        System.out.println(
                "********************Welcome to the Library!********************");
        System.out.println(
                "                  Select From The Following Options:               ");
        System.out.println(
                "**********************************************************************");

        int choice;

        do{
            displayMenu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    String bookId = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Category: ");
                    String category = input.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = input.nextLine();
                    System.out.print("Enter Price: ");
                    int price = input.nextInt();
                    input.nextLine();

                    Books.BooksManager booksManager = new Books.BooksManager();
                    booksManager.addBook(bookId, quantity, category, name, author, price);
                }
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    String bookId = input.nextLine();

                    Books.BooksManager booksManager = new Books.BooksManager();
                    booksManager.issueBook(bookId);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    String bookId = input.nextLine();

                    Books.BooksManager booksManager = new Books.BooksManager();
                    booksManager.returnBook(bookId);
                }
                case 4 -> {
                    System.out.print("Enter Book Name to search: ");
                    String name = input.nextLine();
                    Books.BooksManager booksManager = new Books.BooksManager();
                    Books.Book book = booksManager.searchBook(name);
                    if (book != null) {
                        System.out.println("Book found: " + book.getName() + " by " + book.getAuthor());
                    } else {
                        System.out.println("Book not found");
                    }
                }
                case 5 -> {
                    Books.BooksManager booksManager = new Books.BooksManager();
                    booksManager.showAllBooks();
                }
                case 6 -> {
                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Department: ");
                    String department = input.nextLine();

                    Students.StudentsManager studentsManager = new Students.StudentsManager();
                    studentsManager.addStudent(studentName, rollNumber, department);
            }
            case 7 -> {
                    Students.StudentsManager studentsManager = new Students.StudentsManager();
                    studentsManager.showAllStudents();
                }
                case 8 -> System.out.println("Exiting the system. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
        input.close();

    }
}