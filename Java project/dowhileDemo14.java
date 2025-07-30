import java.util.*;
class dowhileDemo14
{
public static void main(String args[])
{
int a,n1,n2,lcd=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any two numbers =");
n1=sc.nextInt();
n2=sc.nextInt();
a=2;
do
{
if(n1%a==0 && n2%a==0)
{
lcd=a;
break;
}
a++;
}while(a<=n1);
System.out.print(" LCD="+lcd);
}}