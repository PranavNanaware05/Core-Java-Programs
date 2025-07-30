import java.util.*;
class ArrayDemo2
{
public static void main(String args[])
{
int a[]=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.print(" enter Array elements=");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.print(" array elements=");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}}}
