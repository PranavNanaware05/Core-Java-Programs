import java.io.*;
class SquareRoot
{
public static void main(String args[])
{
double n,sq;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print(" enter number");
n=Integer.parseInt(d1.readLine());
sq= Math.sqrt(n);
System.out.println(" square root="+sq);
}catch(Exception e)
{
System.out.println(" error");
}
}
}
