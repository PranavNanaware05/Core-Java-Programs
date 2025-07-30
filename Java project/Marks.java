import java.util.*;
class Marks
{
public static void main(String args[])
{
int a,b,c,d,e,f,tm;
String s1;
float per;
Scanner sc=new Scanner(System.in);
System.out.print(" enter 6 subject marks=");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();
tm=a+b+c+d+e+f;
per=(float)(tm/6.0);
System.out.println(" total marks="+tm);
System.out.println(" percentage="+per);
s1=(a>=35)&&(b>=35)&&(c>=35)&&(d>=35)&&(e>=35)&&(f>=35)?"pass":"fail";
System.out.println(" Remark="+s1);
}
}