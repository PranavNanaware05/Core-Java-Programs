import java.util.*;
class ArrayDemo15
{
public static void main(String args[])
{
int a[]=new int[5];
int i,max=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
max=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.print(" max no from this array="+max);
}}