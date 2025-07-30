import java.util.*;
class whileDemo16
{
public static void main (String args[])
{
int n,a,b;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
while(a<=10)
{
b=n*a;
System.out.println(b);
a++;
}}}