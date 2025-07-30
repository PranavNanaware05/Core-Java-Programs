import java.util.*;
class TDArrayDemo10
{
public static void main(String args[])
{
int a[][]=new int[3][5];
int i,j,k,c;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any 3X5 matrix=");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
}

for(i=0;i<a.length;i++)
  {
    for(j=0;j<a[i].length;j++)
     {
        for(k=j+1;k<a[i].length;k++)
         {
        if(a[i][j]>a[i][k])
         {
           c=a[i][j];
           a[i][j]=a[i][k];
           a[i][k]=c;
          }
     }  }
}

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[i][j]);
System.out.print("\n");
}
  }
    }

