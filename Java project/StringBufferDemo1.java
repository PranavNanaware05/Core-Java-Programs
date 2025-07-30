import java.util.*;
class StringBufferDemo1
{
public static void main(String args[])
{
String s1 ,s2;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any string=");
s1=sc.nextLine();
StringBuffer sb =new StringBuffer(s1);

sb.reverse();
s2=sb.toString();
System.out.print(" reverse="+sb);
if(s1.equalsIgnoreCase(s2))
System.out.print(" string is palindrome");
else
System.out.print(" string is not palindrome");
}}