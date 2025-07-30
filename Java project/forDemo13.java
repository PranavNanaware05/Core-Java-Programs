import java.util.*;
class forDemo13
{
public static void main(String args[])
{
int n,a,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
for(a=1;a<n;a++)
{
if(n%a==0)
sum=sum+a;
}
System.out.print(" sum="+sum);
if(sum==n)
System.out.println(" perfect number");
else
System.out.println(" not perfect number");
}}

