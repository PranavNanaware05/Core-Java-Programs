import java.util.*;
class Student
{
private int roll;
private String name;
private float per;
Scanner sc=new Scanner(System.in);
public void input()
{
System.out.print(" enter roll no=");
roll=sc.nextInt();
System.out.print(" enter name=");
name=sc.next();
System.out.print(" enter percentage=");
per=sc.nextFloat();
}
public void showdata()
{
System.out.println(roll+"\t"+name+"\t"+per);
}}
class ClassDemo14
{
public static void main(String args[])
{
int i;
Student a[]=new Student[5];
for(i=0;i<a.length;i++)
a[i]=new Student();
System.out.println(" enter 5 student record");
for(i=0;i<a.length;i++)
a[i].input();
System.out.println(" student info");
System.out.println("-----------------------------------------------------");
System.out.println(" roll  name  percentage");
System.out.println("-----------------------------------------------------");
for(i=0;i<a.length;i++)
{
a[i].showdata();
}
System.out.println("-----------------------------------------------------");

}}