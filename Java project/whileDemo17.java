import java.util.*;
class whileDemo17
{
public static void main (String args[])
{
int a,n,b;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
while(a<=10)
{
b=n*a;
System.out.println(n+"X"+a+"="+b);
a++;
}}}