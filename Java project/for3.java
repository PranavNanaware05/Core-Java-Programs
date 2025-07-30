// wap pgm sum of odd no 1 to n(n will be odd no)

import java .util.*;
class for3
{
public static void main(String args[])
{
int n ,a,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
for(a=1;a<=n;a++)
{
if(n%2!=0)
{
sum=sum+a;
}
}System.out.print(" sum off odd numbers="+sum);
}}
