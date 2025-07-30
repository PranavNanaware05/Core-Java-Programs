import java.io.*;
class Swap
{
public static void main (String args[])
{
int a,b,c;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print("A=");
a=Integer.parseInt(d1.readLine());
System.out.print("B=");
b=Integer.parseInt(d1.readLine());
System.out.println("before swapping");
System.out.println("A="+a);
System.out.println("B="+b);
c=a;
a=b;
b=c;
System.out.println("after swapping");
System.out.println("A="+a);
System.out.println("B="+b);
}
catch (Exception e)
{

System.out.println("error");
}

}
}