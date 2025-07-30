import java.util.*;
class TDArrayDemo6
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,max=0;
Scanner sc=new Scanner(System.in);

System.out.println(" enter matrix of 3X5");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
   a[i][j]=sc.nextInt();
}

for(i=0;i<a.length;i++)
{
max=a[i][0];
for(j=0;j<a[i].length;j++)
{
    System.out.printf("%3d",a[i][j]);
     if(a[i][j]>max)
      max=a[i][j];
}
System.out.println(" ="+max);

}}}