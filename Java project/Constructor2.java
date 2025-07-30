/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

1-One constructor takes title and author as parameters.
2-The other constructor takes title, author, and price as parameters.
3-Print the values of the variables for each constructor.*/
 import java.util.*;
class Book
  {
    private String author;
    private String title;
    private float price;
 public Book()
  {
        System.out.println("book 1=");
    System.out.println("author=");
  }

  public Book(String x,float z)
  {
    title=x;
    price=z;
    System.out.println("book 2="+title);
    System.out.println("author=");
    System.out.println("book 2 price="+price);
  }
  
   public Book(String x,String y,float z)
  {
    title=x;
    author=y;
    price=z;
    System.out.println("book 3="+title);
    System.out.println("author="+author);
    System.out.println("book 3 price="+price);
  }


 }
class Constructor2
 {
   public static void main(String args[])
     {
        Book b = new Book();
        Book b1 = new Book("introduction to ml",0.0f);
        Book b2 = new Book("introduction to c","dennis ritchie",100.0f);
     }
}