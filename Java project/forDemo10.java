import java.util.*;
class forDemo10
{
public static void main(String args[])
{
int a,x,n,rev=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number= ");
n=sc.nextInt();
x=n;
for (  ; n!=0;  )
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
System.out.print(" reverse="+rev);
if (rev==x)
 {
System.out.println(" no is palindrome");
}
else
{
System.out.println(" no is not palindrome");
}}}