// wap pgm that reads 2 floating pont no & test wether they are same upto three decimal places
import java.util.*;
class elseif3
{
public static void main(String args[])
{
float a,b;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any two float numbers=");
a=sc.nextFloat();
b=sc.nextFloat();

a=a*1000;
a=a/1000;

b=b*1000;
b=b/1000;
 if(a==b)
System.out.print("they are same upto three decimal");
else
System.out.print(" they are different");
}}