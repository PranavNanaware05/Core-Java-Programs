import java.util.*;
class SeprateCubeSum
{
public static void main (String args[])
{
int n ,d1,d2,d3,d4,c1,c2,c3,sum;
Scanner sc=new Scanner(System.in);
System.out.print("enter any 3 digit number=");
n=sc.nextInt();
System.out.println("enter 3 digit number="+n);
d1=n%10;
n=n/10;
d3=n%10;
d4=n/10;
c1=d1*d1*d1;
c2=d3*d3*d3;
c3=d4*d4*d4;
sum=c1+c2+c3;
System.out.println("  first number="+d4);
System.out.println(" second number="+d3);
System.out.println("  third number"+d1);
System.out.println("  first number cube="+c3);
System.out.println(" second number cube ="+c2);
System.out.println("  third number cube="+c1);
System.out.println("sum of  cube of digit="+sum);
}
}