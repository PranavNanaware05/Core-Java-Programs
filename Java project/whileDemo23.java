import java.util.*;
class whileDemo23
{
public static void main(String args [])
{
int x,y,pow=1,i;
Scanner sc =new Scanner (System.in);
System.out.print(" enter x and y=");
x=sc.nextInt();
y=sc.nextInt();
i=1;
while(i<=y)
{
pow=x*pow;
i++;
}
System.out.print("power="+pow);
}}