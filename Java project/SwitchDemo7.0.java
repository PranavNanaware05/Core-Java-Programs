import java.util.*;
class SwitchDemo7.0
{
public static void main (String args [])
float a,b,c;
int ch;
Scanner sc =new Scanner(System.in);
System.out.print(" enter no1=");
a=sc.nextFloat();
System.out.print(" enter no2=");
b=sc.nextFloat();
System.out.print("---------------------------------------");
System.out.println(" 1.Add \n 2.Sub\n3.mul\n4.div\n5.exit");
System.out.print("---------------------------------------");
System.out.println(" enter your choice=");
ch=sc.nextInt();
switch(ch)
{
case 1 :
   c=a+b;
 System.out.println("ADD"+c);
   break;
case 2:
   c=a-b;
 System.out.println("Sub"+c);
   break;
case 3:
   c=a*b;
 System.out.println("mul"+c);
   break;
case 4:
   c=a%b;
 System.out.println("div"+c);
   break;
case 5:
 System.exit(0);
   break;
default:
   System.out.println(" enter correct choice");
}}}