//wap pgm to find days in month


import java.util.*;
class Switch1
{
public static void main(String args[])
{
int m,y;
Scanner sc =new Scanner(System.in);
System.out.print(" enter month number=");
m=sc.nextInt();
System.out.print(" enter year=");
y=sc.nextInt();
switch(m)
{
case 1:
System.out.print(" january");
System.out.print(" 31 days");
  break;
case 2:
System.out.print(" february");
if((y%4==0) || (y%400==0) &&( y%100!=0))
System.out.print(" 29 days");
else
System.out.print(" 28 days");
  break;
case 3:
System.out.print(" March");
System.out.print(" 31 days");
  break;
case 4:
System.out.print(" April");
System.out.print(" 30 days");
  break;
case 5:
System.out.print(" may");
System.out.print(" 31 days");
  break;
case 6:
System.out.print(" june");
System.out.print(" 30 days");
  break;
case 7:
System.out.print(" july");
System.out.print(" 31 days");
  break;
case 8:
System.out.print(" august");
System.out.print(" 31 days");
  break;
case 9:
System.out.print(" september");
System.out.print(" 30 days");
  break;
case 10:
System.out.print(" october");
System.out.print(" 31 days");
  break;
case 11:
System.out.print(" november");
System.out.print(" 30 days");
  break;
case 12:
System.out.print(" december");
System.out.print(" 31 days");
  break;
default :
System.out.print(" enter correct choice");
}}}