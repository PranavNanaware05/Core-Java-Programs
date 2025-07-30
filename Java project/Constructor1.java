/*Write a Java program to create a class called “Cat” with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/
import java.util.*;
class Cat
{
  public Cat()
   {
     System.out.println("name=unknown");
     System.out.println("age=0");
    }
}
class Constructor1
{
  public static void main(String args[])
   {
      Cat c=new Cat();
    }
}   