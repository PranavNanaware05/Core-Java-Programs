import java.util.*;
class Armstrong
{
public static void main (String args [])
{
int sum, n,d1,d2,d3,c1,c2,c3;
String s;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any three digit number =");
n=sc.nextInt();
d3=n%10;
n=n/10;
d2=n%10;
d1=n/10;
c1=d1*d1*d1;
c2=d2*d2*d2;
c3=d3*d3*d3;
sum=c1+c2+c3;
System.out.println(" first no="+d1);
System.out.println(" second no="+d2);
System.out.println(" third no ="+d3);
System.out.println(" sum of cube"+sum);
s=(n==sum)? "Armstrong":"not Armstrong";
System.out.println(" given number is ="+s);
}
}
