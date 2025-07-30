import java.util.*;
class Dkr
{
  public static void main(String args[])
  {
    int a[]=new int[5];
     int i;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Array of size 5=");
       for(i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
 

        System.out.println("Reverse Array");
         for(i=a.length-1;i>=0;i--)
            {
               System.out.print(a[i]+" ");
             }
      }
}