import java.util.*;
class dowhileDemo9
{
public static void main(String args[])
{
int a,n,cnt=0,x;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
x=n;
do
{
cnt++;
n=n/10;
}while(n!=0);
int p,sum=0;
n=x;
do
{
n=n%10;
p=(int)Math.pow(a,cnt);
sum=sum+p;
n=n/10;
}while(n!=0);
System.out.print("sum="+sum);
if(sum==x)
 System.out.println(" number is armstrong");
else 
System.out.println(" number is not armstrong");
}}