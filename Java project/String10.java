import java.util.*;
class String10
{
public static void main(String args[])
{
String s1,s2="";
int i;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String =");
s1=sc.nextLine();
s1=s1.trim();
for(i=s1.length()-1;i>=0;i--)
{
ch=s1.charAt(i);
s2=s2+ch;
}
System.out.println(" reverse string="+s2);
if(s1.equalsIgnoreCase(s2))
System.out.println(" string is palindrome");
else
System.out.println(" string is not palindrome");
}}