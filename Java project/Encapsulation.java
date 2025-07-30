/*Write a Java program to create a class called “Book” with private instance variables title, author, and price. Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.*/

import java.util.*;
class Book
 {
   private String Title;
   private String Author;
   private int price;
   private int disc;
   private int finalp;
  public void set(String x,String y,int z)
   {
     Title=x;
     Author=y;
      price=z;
    }
   public void show()
  {
    System.out.println("Title="+Title);
    System.out.println("Author="+Author);
    System.out.println("Price="+price);
 
   }
  
  public void applyDiscount()
   {
      if(price>=200 )
       {
         disc=(price*5)/100;
         finalp=price-disc;
       }
     else if(price>=500 )
       {
         disc=(price*10)/100;
         finalp=price-disc;
       }
     else
         {
          disc=(price*15)/100;
          finalp=price-disc;
        }
        System.out.println("you get Discount="+disc+"rupees");
        System.out.println("final price of book="+finalp);
    }}
 class Encapsulation
   {
     public static void main(String args[])
      {
        Book b1=new Book();
        b1.set("introduction to c","dennis Ritchie",340);
        b1.show();
        b1.applyDiscount();
       
      }
  }

        