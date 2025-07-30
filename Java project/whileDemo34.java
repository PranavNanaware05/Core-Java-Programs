import java.util.*;
class whileDemo34
{
public static void main(String args[])
{
int a,n,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
sum=sum+a;
n=n/10;
if(n==0 &&sum>=10)
{
System.out.print(" sum="+sum);
n=sum;
sum=0;
}}
System.out.print("sum="+sum);
if(sum==1)
System.out.println(" no is magic");
else 
System.out.println(" no is not magic");
}}