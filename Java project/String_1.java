import java.util.*;
 class String_1
   {
     public static void main(String args[])
      {
        String s1,s2,s3;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter String1=");
          s1=sc.nextLine();
         System.out.println("enter String2=");
          s2=sc.nextLine();
           s3=s1.concat(s2);
           System.out.println(s3);
          }
   }