import java.util.*;
class ArrayDemo16
{
public static void main(String args[])
{
int a[]=new int[5];
int i,min=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.print("small element of an array="+min);
}}