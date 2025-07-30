import java.io.*;
class small2capital
{
public static void main (String args [])
{
char x,w;
int y,z;
DataInputStream d1=new DataInputStream(System.in);
try
{
System.out.print(" enter any small character=");
x=(char)d1.read();
System.out.println(" small character="+x);
y=x;
System.out.println(" ascii value="+y);
z=y-32;
System.out.println(" ascii value="+z);
w=(char)z;
System.out.println(" capital character="+w);

}catch (Exception e)
{
System.out.println(" error");
}
}
}