import java.util.*;
class Dkr
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,k,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter 3X5 matrix=");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
System.out.println(" matrix by ascending order");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
for(k=o;K<a[i].length;k++)
{
if(a[i][j]>a[i][k])
{
c=a[i][j];
a[i][j]=a[i][k];
a[i][k]=c;
}
}}}
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[i][j]);
System.out.println("\n");
}}}