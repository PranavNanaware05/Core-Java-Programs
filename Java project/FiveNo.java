import java.util.*;
class FiveNo
{
public static void main(String args[])
{
int n,d1,d2,d3,d4,d5,rev;
Scanner sc =new Scanner (System.in);
System.out.print(" enter any five digit no=");
n=sc.nextInt();
d5=n%10;
n=n/10;
d4=n%10;
n=n/10;
d3=n%10;
n=n/10;
d2=n%10;
d1=n/10;
rev=(d5*10000)+(d4*1000)+(d3*100)+(d2*10)+(d1);
System.out.println(" Reverse order="+rev);
}
}