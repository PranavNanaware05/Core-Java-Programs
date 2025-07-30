import java.util.*;
class whileDemo31
{
public static void main(String args[])
{
int a,n,sum=0,x;
Scanner sc=new Scanner (System.in);
System.out.print("enter any number =");
n=sc.nextInt();
while (n!=0)
{
a=n%10;
x=a*a*a;
sum=sum+x;
n=n/10;
}
System.out.print(" Sum of cube of  digits="+sum);
}
}