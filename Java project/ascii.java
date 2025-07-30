import java.io.*;
class ascii
{
public static void main (String args[])
{
char n;
int a;
DataInputStream d1=new DataInputStream (System.in);
try
{
System.out.print("enter any character=");
n=(char)d1.read();
System.out.println(" character="+n);
a=n;
System.out.println(" ascii value="+a);
}
catch (Exception e)
{
System.out.println("enter only character");
}
}
}