public class LibraryMain {
    public static void main(String[] args) {
        //create new books
        Book book1 = new Book("Assassin's Apprentice", "Robin Hobb", 1995);
        Book book2 = new Book("The Ship of Magic", "Robin Hobb", 1998);
        Book book3 = new Book("Fool's Assassin", "Robin Hobb", 2014);
        Book book4 = new Book("Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book5 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book6 = new Book("The Silmarillion", "J.R.R. Tolkien", 1977);
        Book book7 = new Book("The Dark Tower: The Gunslinger", "Stephen King", 1982);

        //create new users
        User user1 = new User("Juuso", 31);
        User user2 = new User("Katariina", 31);

        Library library = new Library();

        //add books to library collection
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        //add users to library
        library.addUser(user1);
        library.addUser(user2);

        //display user and collection info
        library.displayUsers();
        library.displayBooks();

        //find books by authors
        library.findBooksByAuthor("robin hobb");
        library.findBooksByAuthor("J.R.R. Tolkien");
        library.findBooksByAuthor("Stephen King");

        //borrowing books
        library.borrowBook("the silmarillion", user1);
        user1.displayBorrowedBooks();
        library.displayBooks();

        //returning books
        library.returnBook("The Silmarillion", user1);
        user1.displayBorrowedBooks();
        library.displayBooks();

        //checking availability after a book is borrowed
        library.borrowBook("assassin's apprentice", user2);
        library.isBookAvailable("assassin's apprentice");

        //setting ratings and adding reviews
        book4.setRating(10);
        book4.addReview("Best book ever written.");
        book4.addReview("Amazing worldbuilding.");
        book4.addReview("A masterpiece.");

        //getting average rating for books and most reviewed book
        library.getAverageBookRating();
        library.getMostReviewedBook();

        //find user info
        library.findUser("Juuso");

    }
}
