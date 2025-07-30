import java.util.*;
class NwhileDemo6
{
public static void main(String args[])
{
int n,b,a,x;
Scanner sc=new Scanner(System.in);
System.out.print( " enter any number=");
n=sc.nextInt();
b=1;
while(b<=n)
{
x=b;
a=2;
while(a<x)
{
if (x%a==0)
  break;
a++;
}
if (x==a)
System.out.println(""+b);
b++;
}}}