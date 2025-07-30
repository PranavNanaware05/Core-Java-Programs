import java.util.*;
class whileDemo29
{
public static void main(String args[])
{
int a,n,rev=0,x;
Scanner sc= new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
x=n;
while(n!=0)
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
if (x==rev)
{
System.out.print(" number is palindrom");
}
else
{
System.out.print(" number is not palindrom");
}
}}