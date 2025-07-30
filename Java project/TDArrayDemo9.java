import java.util.*;
class TDArrayDemo9
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,k,x;
Scanner sc=new Scanner(System.in);
System.out.println(" enter 3X5 matrix=");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
for(i=0,x=a.length-1;j<a.length/2;j++,x--)
{
b=a[j][i];
a[j][i]=a[x][i];
a[x][i]=b;
}}
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[j][i]);
System.out.print("\n");
}
}}
