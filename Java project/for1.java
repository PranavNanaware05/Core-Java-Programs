// wap accept a to n number from user and display its sum

import java.util.*;
class for1
{
public static void main(String args[])
{
int sum=0, a,n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
for(a=1;a<=n;a++)
{
System.out.println(a);
sum=sum+a;
}
System.out.print(" sum of numbers="+sum);
}}