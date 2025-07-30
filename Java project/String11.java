import java.util.*;
class String11
{
public static void main(String args[])
{
String s1,s2,s3;
int a,b,i,flg=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any string=");
s1=sc.nextLine();
System.out.print(" enter any string=");
s2=sc.nextLine();
s1=s1.trim();
s2=s2.trim();
a=s1.length();
b=s2.length();
for(i=0;(i+b)<a;i++)
{
s3=s1.substring(i,i+b);
if(s3.equalsIgnoreCase(s2))
{
flg=1;  
break;
}}
if(flg==0)
System.out.print(" string is not available");
else
System.out.print(" string is available at position"+i);
}}