import java.util.*;
class TDArrayDemo8
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,k,x;
Scanner sc=new Scanner(System.in);
System.out.println(" enter matrix of 3X5=");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}
System.out.println(" matrix of 3X5");
for(x=0;x<a.length;x++)
{
for(i=0,j=a[x].length-1;i<a[x].length/2;i++,j--)
  {
    k=a[x][i];
    a[x][i]=a[x][j];
    a[x][j]=k;
   }
}
System.out.println("reverse row");
for(i=0;i<a.length;i++)
 {
   for(j=0;j<a[i].length;j++)
   System.out.printf("%3d",a[i][j]);
   System.out.print("\n");
  }
}
}