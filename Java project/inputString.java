import java.io.*;
class inputString
{
public static void main (String args[])
{
String s1;
DataInputStream d1= new DataInputStream(System.in);
try
{
System.out.print(" enter any name=");
s1=d1.readLine();
System.out.println("name="+s1);
}
catch (Exception e)
{
System.out.println(" enter only name");
}
}
}