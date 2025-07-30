import java.util.*;
class TDArrayDemo4
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter 3X5 matrix");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
System.out.println(" 3X5 matrix and sum");
for(i=0;i<a.length;i++)
{
sum=0;
for(j=0;j<a[i].length;j++)
{
System.out.printf("%3d",a[i][j]);
sum=sum+a[i][j];
}
System.out.println("="+sum);
}}}