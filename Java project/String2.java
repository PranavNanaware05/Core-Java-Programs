import java.util.*;
class  String2
{
public static void main(String args[])
{
String s1;
int i;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
System.out.println(ch);
}}}