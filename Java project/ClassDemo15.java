import java.util.*;
class Student 
{
private int roll;
private String name;
private float per;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.print(" enter roll ,name &percentage=");
roll=sc.nextInt();
name=sc.next();
per=sc.nextFloat();
}
public void showdata()
{
System.out.println(roll+"\t"+name+"\t"+per);
}
public float getper()
{
return per;
}
}
class ClassDemo15
{
public static void main(String args[])
{
int i,j;
float max=0;
Student a[]=new Student[5];
for(i=0;i<a.length;i++)
a[i]=new Student();

for(i=0;i<a.length;i++)
a[i].getdata();
System.out.println(" student info");
System.out.println("---------------------------------");
System.out.println(" roll  name  per");
System.out.println(" ----------------------------------");
max=a[0].getper();
j=0;
for(i=0;i<a.length;i++)
{
a[i].showdata();
if(a[i].getper()>max)
{
max=a[i].getper();
j=i;
}
}
System.out.println("---------------------------------------");

System.out.println(" topper student");
System.out.println("---------------------------------------");
a[j].showdata();
System.out.println("----------------------------------------");
}}
