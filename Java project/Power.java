import java.io.*;
class Power
{
public static void main(String args [])
{
double n,p;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print(" enter number=");
n=Integer.parseInt(d1.readLine());
System.out.print(" enter power=");
p=Integer.parseInt(d1.readLine());
p=Math.pow(n,p);
System.out.println(" power="+p);
} catch(Exception e)
{
System.out.println(" error");
}
}
}