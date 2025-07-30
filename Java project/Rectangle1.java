import java.io.*;
class Rectangle1
{
public static void main (String args [])
{
int l,w,a,p;
DataInputStream d1=new DataInputStream(System.in);
try 
{
System.out.print(" enter length=");
l=Integer.parseInt(d1.readLine());
System.out.print(" enter width=");
w=Integer.parseInt(d1.readLine());
a=l*w;
p=(l+w)*2;
System.out.println("AREA="+a);
System.out.println("PERIMETER="+p);
}
catch (Exception e)
{
System.out.println("enter only number");
}
}
}