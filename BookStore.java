//Student Name: Gerald Mouton
//LSU ID:894569516
//Lab Section:1
//Assignment: Lab4
//Submission Time: 5:30

import java.util.Collections;
import java.util.ArrayList;


public class BookStore {
    private String address;
    private String name;
    private ArrayList<Book>books=new ArrayList<>();
    //constructor to inizilaize variables
    public BookStore(String address, String name)
    {
        this.address=address;
        this.name=name;
    }
    //can add book to the invoice
    public void addBook(Book book)
    {
        books.add(book);
    }
    //works with compareTo to sort books by title
    public void sortBooks()
    {
        Collections.sort(books);
    }
    //lists the books with the instructed format for the output of the invoice
    public void listBooks()
    {
        
        System.out.println(String.format("%-15s%-15s%-10s%-10s","Title","Author","edition","price"));
        System.out.println("----------------------------------------------------");
        for(Book b : books){
            System.out.println(b.getInfo());
        }
        System.out.println("----------------------------------------------------");
    }
}
