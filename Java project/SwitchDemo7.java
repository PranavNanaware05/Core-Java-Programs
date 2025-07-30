import java.util.*;
class SwitchDemo7
{
public static void main (String args[])
{
int ch;
float a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print(" enter no 1=");
a=sc.nextFloat();
System.out.print(" enter no 2=");
b=sc.nextFloat();
System.out.print("-----------------------------");
System.out.println(" \n1.add\n2.sub\n3.mul\n4.div\n5.exit");
System.out.print("-----------------------------");
System.out.print(" \nenter your choice=");
ch=sc.nextInt();
switch(ch)
{
case 1:
c=a+b;
System.out.print(" add="+c);
break;
case 2:
c=a-b;
System.out.print(" sub="+c);
break;
case 3:
c=a*b;
System.out.print(" mul="+c);
break;
case 4:
c=a%b;
System.out.print(" div="+c);
break;
case 5:
System.exit(0);
break;
default :
System.out.print(" wrong choice");
}}}