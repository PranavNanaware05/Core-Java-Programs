import java.util.*;
class  String22
{
public static void main(String args[])
{
String s1,s2;
int i,cnt=0;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any string=");
s1=sc.nextLine();
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
s2=sb.toString();
System.out.println(" reverse string="+s2);
for(i=0;i<s1.length();i++)
{
ch=s2.charAt(i);
if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
cnt++;
}
System.out.println(" total numbers of vowels="+cnt);
}}