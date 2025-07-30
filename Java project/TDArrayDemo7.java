import java.util.*;
class TDArrayDemo7
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,max[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println(" enter 3X5 array");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
for(i=0;i<max.length;i++)
{
for(j=0;j<a.length;j++)
{
if(max[i]<a[j][i])
max[i]=a[j][i];
}}
System.out.println("3X5 matrix and max no from the column");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[i][j]);
System.out.println("\n");
}
System.out.println(".........................");
for(i=0;i<max.length;i++)
System.out.printf("%3d",max[i]);
}}