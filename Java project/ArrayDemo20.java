import java.util.*;
class ArrayDemo20
{
public static void main(String args[])
{
int a[]=new int[5];
int i,j,flg=0,n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
System.out.print(" enter no to delete=");
n=sc.nextInt();
for(i=0;i<a.length-flg;i++)
{
if(a[i]==n)
{
for(j=1;j<a.length-1-flg;j++)
{
a[j]=a[j+1];
}
a[j]=0;
flg++;
}}
if(flg==0)
System.out.print(" no is not available");
else
System.out.println(" no is successfully deleted");
System.out.println(" new array");
for(i=0;i<a.length-flg;i++)
{
System.out.print(a[i]+" ");
}}}
