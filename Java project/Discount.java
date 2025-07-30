import java .util.*;
class Discount
{
public static void main (String args[])
{
int f, p,q,ba,e,c;
int  n;
Scanner sc =new Scanner(System.in);
System.out.print(" enter price and quantity of item=");
p=sc.nextInt();
q=sc.nextInt();
System.out.println(" price="+p);
System.out.println(" Quantity="+q);
ba=p*q;
System.out.println(" bill amount="+ba);
e=ba%10;
c=ba%15;
n=(q<50)?'e':'c';
System.out.println(" you got off rupees\t"+n);
f=ba-n;
System.out.println(" final bill="+f);

}
}

