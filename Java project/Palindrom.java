import java.util.*;
class Palindrom
{
public static void main (String args[])
{
int n ,d1,d2,d3,rev;
String a;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any three  digit number=");
n=sc.nextInt();
d3=n%10;
n=n/10;
d2=n%10;
d1=n/10;
rev=(d3*100)+(d2*10)+(d1);              
System.out.println(" reverse="+rev);
a=(n==rev)?"palindrom":"not palindrom";            
System.out.println(" given number is\t"+a);
}
}
