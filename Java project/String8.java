import java.util.*;
class String8
{
public static void main(String args[])
throws Exception
{
String s1;
int cnt;
char ch ,x;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
System.out.print(" enter character to search");
x=(char)System.in.read();
cnt=s1.indexOf(x);

if(cnt==-1)
System.out.print(" char is not available in String");
else 
System.out.print(" char is  available in String at position "+cnt);
}}