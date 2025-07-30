import java.util.*;
class whileDemo35
{
public static void main(String args[])
{
int a,n,rev=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
n=rev;
System.out.println(" in word ");
while(n!=0)
{
a=n%10;
if(a==0)
System.out.print("zero");
else if(a==1)
System.out.print(" one");
else if(a==2)
System.out.print(" two");
else if(a==3)
System.out.print(" three");
else if(a==4)
System.out.print("four");
else if(a==5)
System.out.print(" five");
else if(a==6)
System.out.print(" six");
else if(a==7)
System.out.print("seven");
else if(a==8)
System.out.print("eight");
else if(a==9)
System.out.print("nine");

n=n/10;
}
System.out.println("only");
}}