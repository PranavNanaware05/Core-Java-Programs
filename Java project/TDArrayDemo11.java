import java.util.*;
class TDArrayDemo11
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
        if(a[j][i]>a[k][i])
         {
           c=a[j][i];
           a[j][i]=a[k][i];
           a[k][i]=c;
          }
     }  }
}

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
System.out.printf("%3d",a[j][i]);
System.out.print("\n");
}
  }
    }

