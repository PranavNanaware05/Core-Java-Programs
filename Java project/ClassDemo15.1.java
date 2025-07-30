import java.util.*;
class Student
{
private int roll;
private String name;
private String dep;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.print(" enter roll no,name & id=");
roll=sc.nexInt();
name=sc.next();
dep=sc.next();
}
public void showdata()
{
System.out.print(roll+"\t"+name+"\t"+dep);
}
public String getdep()
{
return dep();
}}
class ClassDemo15_1
{
public static void main(String args[])
{
Scannner sc=new Scanner(Systen.in);
int a;
String s2;
Student s1[]=new Student[5];
for(a=0;a<s1.length;a++)
s1[a]=new Student();
System.out.println(" enter 5 students records");
for(a=0;a<s1.length;a++)
     System.out.println(" enter department to show list");
      s2=sc.next();
      System.out.println("student info");
      System.out.println("---------------------------------------");
         System.out.println(" roll  name  department");
       System.out.println("-------------------------------------------");
for(a=o;a<s1.length;a++)
{
   s1[a].showdata();
}
         System.out.println("-------------------------------------------");
         System.out.print(" department list two show");
        System.out.println("--------------------------------------------");
for(a=0;a<s1.length;a++)
if(s1[a].getdepequalsIgnoreCase(s2))
{
   a[s1].showdata();
}
}}