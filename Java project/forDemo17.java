import java.util.*;
class Dkr
 {
    public static void main(String args[])
     {
        int n,sume=0,sumo=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
         {
            if(i%2==0)
             {
               sume=sume+i;
             }
            else
              {
                sumo=sumo+i;
              }
            }
           System.out.println("Sum of even numbers="+sume);
           System.out.println("Sum of odd numbers="+sumo);
        }
  }