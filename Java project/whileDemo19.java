import java.util.*;
class whileDemo19
{
public static void main (String args[])
{
int a,n,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any nunmber=");
n=sc.nextInt();
a=1;
while(a<=n)
{
System.out.println(a);
sum=sum+a;
a++;
}
System.out.print("sum="+sum);
}}