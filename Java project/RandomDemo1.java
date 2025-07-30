import java.util.*;
class RandomDemo1
{
public static void main(String args[])
{
int a;
Random r1;
r1=new Random();
a=r1.nextInt(100);
System.out.println("\t A="+a);
a=r1.nextInt(100);
System.out.println("\t A="+a);
a=r1.nextInt(100);
System.out.println("\t A="+a);
}
}