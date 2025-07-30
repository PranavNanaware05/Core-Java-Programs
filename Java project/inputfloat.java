import java.io.*;
class inputFloat
{
public static void main (String args[])
{
float r,a,p;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print(" enter radius of circle=");
r=Float.parseFloat(d1.readLine());
a=3.14f*r*r;
p=2*3.14f*r;
System.out.println("area="+a);
System.out.println("perimeter="+p);
}
catch(Exception e)
{
System.out.println(" enter number only");
}
}
}