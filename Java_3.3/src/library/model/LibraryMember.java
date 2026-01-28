package library.model;

import java.util.List;
import java.util.ArrayList;

public class LibraryMember{
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public LibraryMember(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    public void reserveBook(Book book){
        if(!reservedBooks.contains(book)){
            reservedBooks.add(book);
            book.setReserved(true);
        }
    }

    public void cancelReservation(Book book){
        if(reservedBooks.contains(book)){
            reservedBooks.remove(book);
            book.setReserved(false);
        }
    }

    public String getMemberName(){return name;}

    public int getMemberId(){return memberId;}

    public List<Book> getBorrowedBooks(){return borrowedBooks;}

    public List<Book> getReservedBooks(){return reservedBooks;}
}