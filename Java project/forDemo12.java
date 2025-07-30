import java.util.*;
class forDemo12
{
public static void main(String args[])
{
int a,sum=0,n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
for(a=2;a<n;a++)
{
if(n%2==0)
break;
}
if(a==n)
System.out.print(" prime number");
else
System.out.print(" not prime number");
}}
