import java.util.*;
class ifDemo5
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any year=");
n=sc.nextInt();
if(n%4==0)
{
System.out.print(" leap year");
}
else
{
System.out.print("not leap year");
}}}