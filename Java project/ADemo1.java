import java.util.*;
class  ADemo1
{
 public static void main(String args[])
 {
  int a[]=new int[5];
  int i,max;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Of size 5=");
  for(i=0;i<a.length;i++)
  {
   a[i]=sc.nextInt();
  }
  max=a[0];
  for(i=0;i<a.length;i++)
  {
      if(max<a[i])
      {
       max=a[i];
      }
  }
   System.out.println("max number="+max);
  
 }
}