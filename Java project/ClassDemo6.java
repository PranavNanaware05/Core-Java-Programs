import java.util.*;
class Student
{
private int roll;
private String name;
private float per;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.print(" enter roll no=");
roll=sc.nextInt();
System.out.print(" enter name=");
name=sc.next();
System.out.print(" enter percentage=");
per=sc.nextFloat();
}
public void showdata()
{
System.out.println("roll no="+roll);
System.out.println("name="+name);
System.out.println("percentage="+per);
}}
class ClassDemo6
{
public static void main(String args[])
{
Student s1=new Student();
System.out.println("enter student information");
s1.input();
System.out.println(" student information");
s1.showdata();
}}