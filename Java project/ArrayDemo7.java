import java.util.*;
class ArrayDemo7
{
public static void main(String args[])
{
int a[]=new int[5];
int i,sum=0,p=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter marks of 6 subjects=");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
p=sum/6;
}
System.out.print(" sum of total marks="+sum);
System.out.print(" percentage="+p);
}}