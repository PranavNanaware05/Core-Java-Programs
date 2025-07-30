import java.util.*;
class Seprate3_No
{
public static void main (String args[])
{
int n,d1,d2,d3,rev;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any 3 digit number=");
n=sc.nextInt();
System.out.println(" 3 digit number="+n);
d3=n%10;
n=n/10;
d2=n%10;
d1=n/10;
rev=(d3*100)+(d2*10)+(d1);
System.out.println("reverse order="+rev);
}
}