import java.util.*;
class TDArrayDemo12
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println(" enter 3X3matrix");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
System.out.println("transpose matrix");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[j][i]);
System.out.print("\n");
}}}