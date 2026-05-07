/*
Q15.Create Book class:
bookId
bookName
price
Store books in Vector and calculate total price of all books.
Description
Logical operation:
total = total + price
Input
1 Java 500
2 SQL 350
3 Python 400
Output
Total Book Price = 1250
 */
import java.util.*;

class Book
{
    private int bookId;
    private String bookName;
    private int price;

    public Book(int bookId, String bookName, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    int getId()
    {
        return bookId;
    }
     String getName()
     {
        return bookName;
     }

     int getprice()
     {
        return price;
     }
}
public class BooksPrice {
    public static void main(String[] args) {
       
        Book b1=new Book(1, "Java", 350);
        Book b2=new Book(1, "Sql", 500);
        Book b3=new Book(3,"python", 400);

        Vector v=new Vector<>();
        v.add(b1);
        v.add(b2);
        v.add(b3);

        int totalprice=0;
        for (Object  obj : v) {
            Book b=(Book)obj;

            totalprice=totalprice+b.getprice();
            
        }

        System.out.println("Total price of all book : "+ totalprice);

        
    }
    
}
