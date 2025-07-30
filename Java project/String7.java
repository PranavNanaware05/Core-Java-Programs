import java.util.*;
class String7
{
public static void main(String args[])
throws Exception
{
String s1;
int i,cnt=0;
char ch=0,x;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any string=");
s1=sc.nextLine();
System.out.print(" enter any character=");
x=(char)System.in.read();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
if(ch==x)
{
cnt++;
break;
}}
if(cnt==0)
System.out.print(" char not available");
else
System.out.print(" character is available at position="+i);
}}