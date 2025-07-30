import java.util.*;
class whileDemo30
{
public static void main(String args[])
{
int a,n,sum=0;
Scanner sc=new Scanner (System.in);
System.out.print("enter any number =");
n=sc.nextInt();
while (n!=0)
{
a=n%10;
sum=sum+a;
n=n/10;
}
System.out.print(" Sum of digits="+sum);
}
}