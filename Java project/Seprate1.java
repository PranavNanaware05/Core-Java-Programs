import java.util.*;
class Seprate1
{
public static void main (String args[])
{
int n ,d1,d2,d3,d4;
Scanner sc=new Scanner(System.in);
System.out.print("enter any 3 digit number=");
n=sc.nextInt();
System.out.println("enter 3 digit number="+n);
d1=n%10;
n=n/10;
d3=n%10;
d4=n/10;
System.out.println(" enter first number="+d1);
System.out.println(" enter second number="+d3);
System.out.println(" enter third number"+d4);
}
}