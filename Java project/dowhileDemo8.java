import java.util.*;
class dowhileDemo8
{
public static void main(String args[])
{
int x,n,a ,rev=0;
Scanner sc =new Scanner (System.in);
System.out.print(" enter any number =");
n=sc.nextInt();
a=1;
x=n;
do
{
a=n%10;
rev=rev*10+a;
n=n/10;
}while (n!=0);
System.out.print(" reverse="+rev);
 if (x==rev)
 System.out.println(" no is palindrome");
 else 
System.out.println(" no is not  palindrome");
}}