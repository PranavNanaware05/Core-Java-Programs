import java.util.*;
class ArrayDemo18
{
public static void main(String args[])
{
int a[]=new int[5];
int i,flg=0,n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
System.out.print(" enter no to search=");
n=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
flg++;
System.out.println(" no is available at position "+i);
}}
if(flg==0)
System.out.print(" no is not available");
else
System.out.println(" no is available "+flg+"times");
}}