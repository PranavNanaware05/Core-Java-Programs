import java.util.*;
class dowhileDemo11
{
public static void main (String args[])
{
int a,n,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
do
{
if(n%a==0)
sum=sum+a;
a++;
}while(a<n);
System.out.println(" sum="+sum);
if (sum==n)
System.out.println(" no is perfect");
else
System.out.println(" no is not perfect");
}}