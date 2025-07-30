import java.util.*;
class NwhileDemo7
{
public static void main (String args[])
{
int a,n,sum=0,b;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
b=1;
while(b<=n)
{
a=b;
while(n!=0)
{
a=n%10;
sum=sum+a;
n=n/10;
if(n==0 && n>=10)
{
System.out.print("sum="+sum);
n=sum;
sum=0;
}}
b++;
}
System.out.println("sum="+n);
if (sum==1)
System.out.println(" no is magic");
else
System.out.println(" no is not magic");
}}