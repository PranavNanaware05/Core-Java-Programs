import java.util.*;
class OddEven
{
public static void main (String args[])
{
int n;
String s1;
Scanner sc=new Scanner(System.in);
System.out.print(" enter number=");
n=sc.nextInt();
s1=(n %2==0)?"even":"odd";
System.out .println(" given number is="+s1);
}
}
