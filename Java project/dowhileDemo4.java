import java.util.*;
class dowhileDemo4
{
public static void main (String args[])
{
int a,n,x;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
do
{
x=n*a;
System.out.println(x);
a++;
}while(a<=10);
}}