//wap take three no from user and print greatest number

import java.util.*;
class elseif1
{
public static void main (String args [])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print(" enter three numbers =");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.print(" greatest no=");
if(a>b && a>c)
   System.out.print(a);
else if(b>a && c>a)
    System.out.print(b);
else 
   System.out.print(c);
}}