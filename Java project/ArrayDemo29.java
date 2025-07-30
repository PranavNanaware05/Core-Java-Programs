import java.util.*;
class ArrayDemo29
{
  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
         int i,rev=0,n,b;
       System.out.print("enter array of size 5");
       for(i=0;i<a.length;i++)
         {
           a[i]=sc.nextInt();
         }
       System.out.println("Reverse Array elements");
        for(i=0;i<a.length;i++)
          {
            n=a[i];
             rev=0;
             while(n!=0)
              {
                 b=n%10;
                  rev=rev*10+b;
                 n=n/10;
               }
               System.out.println(a[i]+"\t"+rev);
             }
      }
}