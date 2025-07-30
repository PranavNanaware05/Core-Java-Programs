import java.util.*;
class String9
{
public static void main(String args[])
{
String s1,s2="";
int i;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
for(i=s1.length()-1;i>=0;i--)
{
ch=s1.charAt(i);
s2=s2+ch;
}
System.out.print(" reverse string="+s2);
}}