import java.util.*;
class String13
{
public static void main(String args[])
{
String s1,s2;
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
for(i=0;i<s1.length();i++)
{
s2=s1.substring(0,i+1);
System.out.println(s2);
}
for(i=s1.length()-2;i>=0;i--)
{
s2=s1.substring(0,i+1);
System.out.println(s2);
}
}}