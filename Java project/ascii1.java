import java.io.*;
class ascii1
{
public static void main (String [] args)
{
char c;
int n;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print(" enter any number =");
n=Integer.parseInt(d1.readLine());
System.out.println("number="+n);
c=(char)n;
System.out.println(" character="+c);

} 
catch (Exception e)
{
System.out.println("enter only numbers");
}
}
}