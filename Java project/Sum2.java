import java.io.*;
class Sum2
{
public static void main(String args [])
{
int a,b,s;
DataInputStream d1= new DataInputStream(System.in);
try
{
System.out.print(" enter any two numbers");
a=Integer.parseInt(d1.readLine());
b=Integer.parseInt(d1.readLine());
s=a+b;
System.out.println(" sum="+s);
} catch (Exception e)
{
System.out.println("enter only numbers");
}
}
}