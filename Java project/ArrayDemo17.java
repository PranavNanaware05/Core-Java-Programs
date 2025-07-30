import java.util.*;
class ArrayDemo17
{
public static void main(String args[])
{
int a[]=new int[5];
int i,flg=0,n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
System.out.print("enter no to search=");
n=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
flg=1;
break;
}}
if(flg==0)
System.out.print(" no is not available");
else
System.out.print(" number is available at position="+i);
}}