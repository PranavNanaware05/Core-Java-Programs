import java .util.*;
class whileDemo28
{
public static void main (String args[])
{
int a,n,rev=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
System.out.print(" Reverse="+rev);
}}