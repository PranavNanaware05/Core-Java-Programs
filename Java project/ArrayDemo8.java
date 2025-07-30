import java.util.*;
class ArrayDemo8
{
  public static void main(String args[])
   {
     int a[]=new int[5];
     int b[]=new int[5];
     int i,j;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter arry of size 5=");
     for(i=0;i<a.length;i++)
     {
       a[i]=sc.nextInt();
      }
      for(i=a.length-1,j=0;i>=0;i--,j++)
       {
         b[j]=a[i];
       }
       System.out.print("Array 2 element");
        for(i=0;i<b.length;i++)
         {
           System.out.print(b[i]+" ");
         }
      }
}

   