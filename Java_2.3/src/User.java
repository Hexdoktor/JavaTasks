import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed books by " + name + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
            return;
        }
        int i = 1;
        for (Book book : borrowedBooks) {
            System.out.println(i + ". \"" + book.getTitle() + "\" by " + book.getAuthor());
            i++;
        }
    }

    public String getUserName() {
        return name;
    }

    public int getUserAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
