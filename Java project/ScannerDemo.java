import java.util.*;
class ScannerDemo
{
public static void main (String args[])
{
int a;
float b;
long c;
String d;
Scanner sc=new Scanner(System.in);
System.out.print(" enter int=");
a=sc.nextInt();
System.out.print(" enter float=");
b=sc.nextFloat();
System.out.print(" enter long=");
c=sc.nextLong();
System.out.print(" enter string=");
d=sc.nextLine();

System.out.println("integer="+a);
System.out.println("float="+b);
System.out.println("long="+c);
//System.out.println("string="+d);
}
}