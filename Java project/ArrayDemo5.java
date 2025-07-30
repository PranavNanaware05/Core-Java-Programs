import java.util.*;
class ArrayDemo5
{
public static void main(String args[])
{
int a[]=new int[5];
int i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.print(" sum of array elements="+sum);
}}