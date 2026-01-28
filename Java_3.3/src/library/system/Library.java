package library.system;

import library.model.Book;
import library.model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(LibraryMember member){
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book){
        if(books.contains(book)){
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getMemberName() + " borrowed: "+ book.getTitle());
        }else{
            System.out.println("Book not available: " +book.getTitle());
        }

    }

    public void returnBook(LibraryMember member, Book book){
        member.returnBook(book);
        books.add(book);
        System.out.println(member.getMemberName() + " returned: " + book.getTitle());
    }

    public void reserveBook(LibraryMember member, Book book){
        if(books.contains(book) && !book.isReserved()){
                member.reserveBook(book);
                System.out.println(book+ " reserved for: " + member.getMemberName());
            }else{
                System.out.println("Cannot reserve book.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book){
        if(member.getReservedBooks().contains(book)){
            member.cancelReservation(book);
            System.out.println(member.getMemberName() + " canceled reservation for: " + book.getTitle());
        }else{
            System.out.println("This member has not reserved that book.");
        }
    }

    public void showReservedBooks(LibraryMember member){
        System.out.println("Books reserved for: "+ member.getMemberName());
        for(Book book : member.getReservedBooks()){
            System.out.println(book);
        }
    }
}
