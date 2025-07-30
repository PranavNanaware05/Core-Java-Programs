import java.util.*;
class forDemo1
{
public static void main(String args[])
{
int a,n, fact=1;
Scanner sc=new Scanner (System.in);
System.out.print(" enter a number");
n=sc.nextInt();
for(a=1;a<=n;a++)
{
fact=fact*a;

}
System.out.print(" factorial="+fact);
}}