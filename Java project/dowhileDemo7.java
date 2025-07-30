import java.util.*;
class dowhileDemo7
{
public static void main(String args[])
{
int a,n,rev=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
do
{
a=n%10;
rev=rev*10+a;
n=n/10;
}while(n!=0);
System.out.print(" reverse no="+rev);
}}