import java.util.*;
class TDArrayDemo14
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j,k,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter 3X3 matrix");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
a[i][j]=sc.nextInt();
}

System.out.println(" enter 3X3 matrix");

for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
b[i][j]=sc.nextInt();
}
                                    
for(i=0;i<a.length;i++)            //loop for matrix multiplication
{
for(j=0;j<a[i].length;j++)
{
sum=0;
for(k=0;k<a.length;k++)
sum=sum+(a[i][k]*b[k][j]);
c[i][j]=sum;
}}

System.out.println(" matrix multiplication");
for(i=0;i<c.length;i++)
{
for(j=0;j<c[i].length;j++)
System.out.printf("%3d",c[i][j]);
System.out.print("\n");
}}}