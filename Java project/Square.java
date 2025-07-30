import java.io.*;
class Square
{
public static void main (String args [])
{
int n,sq;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print("enter any number=");
n=Integer.parseInt(d1.readLine());
sq=n*n;
System.out.println("square="+sq);
} catch (Exception e)
{
System.out.println(" error");
}
}
}