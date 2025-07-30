// wap pgm ip 5 no from user and find there sum & average

import java.util.*;
class for2
{
public static void main(String args[])
{
int a,b,c,d,e,n,sum=0,avg;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any 5 numbers=");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
for(n=0;n<=5;n++)
{
sum=sum+n;
}
avg=sum/5;
System.out.println("sum="+sum);
System.out.println("average="+avg);
}}