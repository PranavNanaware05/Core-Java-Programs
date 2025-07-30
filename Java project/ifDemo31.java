import java.util.*;
class ifDemo31
{
public static void main(String args[])
{
float a,b,c,d,e,f,tm,per;
Scanner sc=new Scanner(System.in);
System.out.print(" enter marks of six subjects=");
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();
d=sc.nextFloat();
e=sc.nextFloat();
f=sc.nextFloat();
tm=a+b+c+d+e+f;
per=tm/6;
System.out.println(" total marks="+tm);
System.out.println(" percentage="+per);
if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35 && f>=35)
{
System.out.println(" remark =pass");
if(per<50)
System.out.println(" grade=pass class");
 else if(per<60)
System.out.println(" grade=second class");
 else if(per<70)
System.out.println(" grade=first class");
else
System.out.println(" grade=distinction");
}
else
System.out.println("Remark=fail");
}}