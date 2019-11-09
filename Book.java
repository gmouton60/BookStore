//Student Name: Gerald Mouton
//LSU ID:894569516
//Lab Section:1
//Assignment: Lab4
//Submission Time: 5:30

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int edition;
    private double price;
    //Book constructor to inizilaize names of variables
    public Book(String title, String author, int edition, double price)
    {
        this.title=title;
        this.author=author;
        this.edition=edition;
        this.price=price;
    }
    //gets the information to print to the invoice and uses formatted output
    public String getInfo()
    {
        return String.format("%-15s%-15s%-10d%-10f",title.substring(0,10),author.substring(0,10),edition,price);
    }
    //override sort to sort the books in order by title
    @Override
    public int compareTo(Book other)
    {
         return title.compareTo(other.title);
    }
}
