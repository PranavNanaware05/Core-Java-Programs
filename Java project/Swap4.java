import java.util.*;
class Swap4
{
public static void main (String args[])
{
int n,d1,d2,d3,d4,d5,swp;
Scanner sc= new Scanner(System.in);
System.out.print(" enter five digit number=");
n=sc.nextInt();
d5=n%10;
n=n/10;
d4=n%10;
n=n/10;
d3=n%10;
n=n/10;
d2=n%10;
d1=n/10;
swp=(d5*10000)+(d2*1000)+(d3*100)+(d4*10)+(d1);
System.out.println(" after swap="+swp);
}
}
