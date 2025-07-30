import java.util.*;
class ProfitLoss
{
public static void main (String args[])
{
int s,p;
String a;
Scanner sc=new Scanner (System.in);
System.out.print( "enter selling price and purchase price=");
s=sc.nextInt();
p=sc.nextInt();
System.out.println(" selling price="+s);
System.out.println(" purchase price="+p);
a=(s>p)?"profit":"loss";
System.out.println(" person made="+a);
}
}