import java.util.*;
class dowhileDemo10
{
public static void main(String args[])
{
int a,n;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number =");
n=sc.nextInt();
a=2;
do
{
if (n%2==0)
break;
a++;
}while(a<n);
if(a==n)
 System.out.print(" no is prime");
else 
System.out.print(" no is not prime");
}}
