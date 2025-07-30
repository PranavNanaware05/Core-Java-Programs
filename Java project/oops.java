/*Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/
 import java.util.*;
class person
 { 
    private String name;
    private int age;
   public person()
   {
     System.out.println("pranav is 12 years old");
     System.out.println("nihal is 20 yearse old");
   }
   public person(String x,int y)
     {    
        name=x;
        age=y;
       System.out.println(name+"is"+age+"years old");
     }
  }
class oops
{
  public static void main(String args[])
   {  
     person p=new person();
     person p1=new person("pranav",21);
     person p2=new person("nihal",25);


   }
}