import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        int i = 1;
        System.out.println("\nAll books in the library collection:");
        for (Book book : books) {
            System.out.println(i + "." + " Title: \"" + book.getTitle() + "\"," + " Author: \"" + book.getAuthor() + "\" " + "Year: " + book.getPubYear());
            i++;
        }
    }

    void findBooksByAuthor(String author) {
        int i = 1;
        System.out.println("\nAll books in collection by \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(i + "." + " Title: \"" + book.getTitle() + "\"," + " Author: \"" + book.getAuthor() + "\" " + "Year: " + book.getPubYear());
                i++;
            }
        }
        if (i == 1) {
            System.out.println("No books found by this author.");
        }
    }

    void borrowBook(String title, User user) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                user.borrowBook(book);
                System.out.println("\n\"" + book.getTitle() + "\"" + " borrowed by \"" + user.getUserName() + "\" and removed from library collection.");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found.");
    }

    void returnBook(String title, User user) {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.returnBook(book);
                books.add(book);
                System.out.println("\n\"" + book.getTitle() + "\"" + " returned and added to library collection.");
                return;
            }
        }
        System.out.println("\n" + user.getUserName() + " does not have \"" + title + "\" borrowed.");
    }

    boolean isBookAvailable(String title) {
        System.out.println("\nChecking if \"" + title + "\" is available...");
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book \"" + title + "\" is available.");
                return true;
            }
        }
        System.out.println("Book \"" + title + "\" not found.");
        return false;
    }

    double getAverageBookRating() {
        int i = 0;
        double totalRatingOfAllBooks = 0;
        if (books.isEmpty()) {
            return 0;
        }
        for (Book book : books) {
            totalRatingOfAllBooks += book.getRating();
            i++;
        }
        System.out.printf("\nAverage rating of all books in the library: %.2f", totalRatingOfAllBooks / i);
        return totalRatingOfAllBooks / i;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        System.out.println("\n\nSearching for most reviewed book...");
        Book mostReviewed = null;
        int maxReviews = -1;

        for (Book book : books) {
            int reviewCount = book.getReviews().size();
            if (reviewCount > maxReviews) {
                maxReviews = reviewCount;
                mostReviewed = book;
            }
        }
        System.out.println("The book with the most reviews is \"" + mostReviewed.getTitle() + "\".");
        return mostReviewed;
    }

    void addUser(User user) {
        users.add(user);
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(name)) {
                System.out.println("\nUser name: "+user.getUserName()+", User age: "+user.getUserAge());
                return user;
            }
        }
        return null;
    }

    void displayUsers() {
        System.out.println("\nRegistered library users:");
        int i = 1;
        for (User user : users) {
            System.out.println(i + ". " + user.getUserName() + " (" + user.getUserAge() + ")");
            i++;
        }
    }
}
