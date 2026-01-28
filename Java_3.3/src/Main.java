import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;


public class Main {
    public static void main(String [] args){
        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell","12345");
        Book b2 = new Book("Dune", "Frank Herbert", "67899");

        LibraryMember m1 = new LibraryMember("Juuso",1);
        LibraryMember m2 = new LibraryMember("Katariina", 2);

        library.addBook(b1);
        library.addBook(b2);

        library.addMember(m1);
        library.addMember(m2);

        library.borrowBook(m1,b1);
        library.borrowBook(m2,b2);
        library.returnBook(m1,b1);

        library.reserveBook(m1, b1);
        library.showReservedBooks(m1);
        library.cancelReservation(m1,b1);
    }
}
