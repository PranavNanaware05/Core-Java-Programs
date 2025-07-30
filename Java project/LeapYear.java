import java.util.*;
class LeapYear
{
public static void main(String args[])
{
int n;
String l;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
l=(n%4==0)?"Leap year":"not leap year";
System.out.println(" given year is\t"+l);
}
}