import java.util.*;
class ArrayDemo4
{
public static void main(String args[])
{
int a[]=new int[5];
int i;
Scanner sc =new Scanner(System.in);
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.print("odd numbers=");
for(i=0;i<a.length;i++)
{
if(a[i]%2!=0)
System.out.print(a[i]+" ");
}
}}