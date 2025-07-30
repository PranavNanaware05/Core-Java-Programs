import java.util.*;
class Student
{
private int roll;
private String name;
private String dep;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.print(" enter roll no,name & dep=");
roll=sc.nextInt();
name=sc.next();
dep=sc.next();
}
public void showdata()
{
System.out.println(roll+"\t"+name+"\t"+dep);
}
public String getdep()
{
return dep;
}}
class ClassDemo15_1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
String s2;
Student s1[]=new Student[5];
for(a=0;a<s1.length;a++)
s1[a]=new Student();
System.out.println(" enter 5 students records");
for(a=0;a<s1.length;a++)
s1[a].getdata();
     System.out.println("-------------------------------------- ");
     System.out.print(" enter department to show list=");
      s2=sc.next();
System.out.println(-----------------------------------------------);
      System.out.println("       student info");
      System.out.println("---------------------------------------");
         System.out.println(" roll  name  department");
       System.out.println("-------------------------------------------");
for(a=0;a<s1.length;a++)
{
   s1[a].showdata();
}
         System.out.println("-------------------------------------------");
         System.out.println(" department list two show");
        System.out.println("--------------------------------------------");
for(a=0;a<s1.length;a++)
if(s1[a].getdep().equalsIgnoreCase(s2))
{
   s1[a].showdata();
}
}}