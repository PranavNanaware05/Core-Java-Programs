import java.util.*;
class forDemo8
{
public static void main (String args[])
{
int a,x,y,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any two numbers=");
x=sc.nextInt();
y=sc.nextInt();
for (a=1;a<=x;a++)
{
sum=sum+y;
}
System.out.print(" mul="+sum);
}}