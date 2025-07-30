import java.util.*;
class whileDemo6
{
public static void main(String args[])
{
int a,n;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
while(a<=n)
{
if (a%2==0)

System.out.println(a);
a++;
}}}