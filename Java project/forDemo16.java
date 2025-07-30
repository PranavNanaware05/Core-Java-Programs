import java.util.*;
class  forDemo16
{
public static void main(String args[])
{
int a,n1,n2,lcd=0;
Scanner sc=new Scanner (System.in);
System.out.print(" enter any 2 numbers =");
n1=sc.nextInt();
n2=sc.nextInt();
for(a=2;a<=n1;a++)
{
if(n1%a==0 && n2%a==0)
{
lcd=a;
break;
}}
System.out.print("LCD="+lcd);
}}