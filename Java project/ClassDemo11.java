import java.util.*;
class Employee
{
private int id;
private String name;
private float bs;
Scanner sc=new Scanner(System.in);
public void input()
{
System.out.print(" enter id no=");
id=sc.nextInt();
System.out.print(" enter employee name=");
name=sc.next();
System.out.print("enter basic salary=");
bs=sc.nextFloat();
System.out.println("-------------------------------------------------");
}
public void showdata()
{
System.out.println("id no ="+id);
System.out.println(" employee name="+name);
System.out.println(" basic salary ="+bs);
}
}
class ClassDemo11
{
public static void main(String args[])
{
Employee e=new Employee();
System.out.println(" enter employee information");
e.input();
System.out.println(" employee information");
e.showdata();
}}