import java.util.*;
class ArrayDemo9
{
public static void main(String args[])
{
int a[]=new int[5];
int i,b;
Scanner sc=new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
b=a[a.length-1];
for(i=a.length-1;i>=1;i--)
{
a[i]=a[i-1];
}
a[i]=b;
System.out.print(" output=");
for(i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}}
