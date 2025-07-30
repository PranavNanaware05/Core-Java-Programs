import java.util.*;
class ArrayDemo23
{
public static void main(String args[])
{
int a[]=new int[5];
int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.print("Enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
k=a[i];
a[i]=a[j];
a[j]=k;
}}}
System.out.println(" array in ascending order");
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}}
