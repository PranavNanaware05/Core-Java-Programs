import java.util.*;
class ArrayDemo19
{
public static void main(String args[])
{
int a[]=new int[5];
int i,n,flg=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
System.out.print(" enter no to delete=");
n=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
a[i]=0;
flg++;
}}
if(flg==0)
System.out.print(" no is not available");
else
{
System.out.print(" no is deleted successfully ");
System.out.print(" new array");
for(i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}
}}