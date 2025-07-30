import java.util.*;
class ifDemo7
{
public static void main(String args[])
{
int a,b,c,d,e,f,sum,per;
Scanner sc=new Scanner (System.in);
System.out.print(" enter marks of 6 subject=");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();
sum = a+b+c+d+e+f;
System.out.println(" total marks="+sum);
per=sum/6;
System.out.println("percentage="+per);
if(a>=40 && b>=40 && c>=40 && d>=40 && e>=40 && f>=40)
{
System.out.print(" pass");
}
else
{
System.out.print("fail");
}
}}