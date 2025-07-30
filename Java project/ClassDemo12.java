import java.util.*;
class Product
{
private int co;
private String name;
private float p;
private int q;
Scanner sc=new Scanner(System.in);
public void input()
{
System.out.print("enter product code=");
co=sc.nextInt();
System.out.print(" enter product name=");
name=sc.next();
System.out.print(" enter product price=");
p=sc.nextFloat();
System.out.print(" enter Quantity=");
q=sc.nextInt();
System.out.println("-------------------------------------------------");
}
public void showdata()
{
System.out.println("product code="+co);
System.out.println(" product name="+name);
System.out.println(" product price="+p);
System.out.println("product quantity="+q);
}}
class ClassDemo12
{
public static void main(String args[])
{
Product p = new Product();
System.out.println(" enter product information");
p.input();
System.out.println("Product information");
p.showdata();
}}