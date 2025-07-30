import java.util.*;
class Seprate1Sum
{
public static void main (String args[])
{
int n ,d1,d2,d3,d4,sum;
Scanner sc=new Scanner(System.in);
System.out.print("enter any 3 digit number=");
n=sc.nextInt();
System.out.println("enter 3 digit number="+n);
d1=n%10;
n=n/10;
d3=n%10;
d4=n/10;
sum=d1+d3+d4;
System.out.println(" enter first number="+d4);
System.out.println(" enter second number="+d3);
System.out.println(" enter third number"+d1);
System.out.println("sum of digit="+sum);
}
}