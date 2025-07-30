import java.util.*;
class Rectangle
{
private int len;
private int wid;
public void setvalues(int x,int y)
{
len=x;
wid=y;
}
public void show()
{
System.out.println("length="+len);
System.out.println("width="+wid);
}
public int area()
{
int a=len*wid;
return a;
}}
class ClassDemo3
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println(" enter length and width=");
a=sc.nextInt();
b=sc.nextInt();
Rectangle r1=new Rectangle();
r1.setvalues(a,b);
System.out.println(" rectangle info");
r1.show();
int x=r1.area();
System.out.println(" area="+x);
}}
