import java.util.*;
class Date_Month
{
public static void main (String args[])
{
int n,d,m,y,d1;
Scanner a=new Scanner (System.in);
System.out.print(" enter any number=");
n=a.nextInt();
y=n/365;
m=y%365;
d=m%31;
d1=d%7;
System.out.println(" year="+m);
System.out.println(" month="+d);
System.out.println(" date="+d);
System.out.println(" day="+d1);
}
}