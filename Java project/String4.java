import java.util.*;
class String4
{
public static void main(String args[])
{
String s1;
int i,cnt=0;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
if(ch>=65&&ch<=90)
cnt++;
}
System.out.print(" no of  capital alphabet="+cnt);
}}
