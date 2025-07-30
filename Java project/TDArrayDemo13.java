import java.util.*;
class TDArrayDemo13
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter 3X3 matrix 1=");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
System.out.println("enter 3X3 matrix 2=");
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
b[i][j]=sc.nextInt();
}

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
c[i][j]=a[i][j]+b[i][j];
}

System.out.println("Addition of matrix=");
for(i=0;i<c.length;i++)
{
for(j=0;j<c[i].length;j++)
System.out.printf("%3d",c[i][j]);
System.out.println("\n");
}
}}