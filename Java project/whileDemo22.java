import java .util.*;
class whileDemo22
{
public static void main(String args[])
{
int a,b,c=0,i;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any  two number=");
a=sc.nextInt();
b=sc.nextInt();
i=1;
while (i<=b)
{
c=c+a;
i++;
}
System.out.print(" mul="+c);
}}
