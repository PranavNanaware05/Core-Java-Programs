import java.util.*;
class whileDemo21
{
public static void main (String args[])
{
int a,n,fact=1;
Scanner sc=new Scanner (System.in);
System.out.print("enter any number =");
n=sc.nextInt();
a=1;
while(a<=n)
{
fact=fact*a;
a++;
}
System.out.print(" factorial no="+fact);
}}