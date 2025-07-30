import java.util.*;
class forDemo15
{
public static void main(String args[])
{
int a,n1,n2,gcd=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any two numbers =");
n1=sc.nextInt();
n2=sc.nextInt();
for(a=1;a<=n1;a++)
{
if(n1%a==0 && n2%a==0)
{
gcd=a;
}}
System.out.print("GCD="+gcd);
}}