import java.util.*;
class dowhileDemo5
{
public static void main (String args[])
{
int a,x,y,z=0;
Scanner sc =new Scanner (System.in);
System.out.print(" enter any two numbers");
x=sc.nextInt();
y=sc.nextInt();
a=1;
do
{
z=z+x;
a++;
}while(a<=y);
System.out.print( "multi="+z);
}}
