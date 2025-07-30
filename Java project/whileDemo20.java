import java.util.*;
class whileDemo20
{
public static void main (String args[])
{
int a,n,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
while(a<=n)
{
System.out.print(a+"+");
sum=sum+a;
a++;
}
System.out.print(" \b\b="+sum);}}