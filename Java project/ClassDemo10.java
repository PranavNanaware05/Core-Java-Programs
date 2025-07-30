import java.util.*;
class Book
{
private int co;
private String au;
private Float p;
Scanner sc=new Scanner(System.in);
public void input()
{
System.out.print(" enter book code=");
co=sc.nextInt();
System.out.print("enter author name=");
au=sc.next();
System.out.print(" enter book price=");
p=sc.nextFloat();
System.out.println("-------------------------------------------------");
}
public void showdata()
{
System.out.println("book code="+co);
System.out.println("book author name="+au);
System.out.println("book price="+p);
}
}
class ClassDemo10
{
public static void main(String args[])
{
Book a = new Book();
System.out.println(" enter book information");
a.input();
System.out.println("book information");
a.showdata();
}}