import java.util.*;
class String5
{
public static void main(String args[])
{
String s1;
int i,cnt=0;
char ch;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any string=");
s1=sc.nextLine();
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
if(ch>=48 &&ch<=57)
cnt++;
}
System.out.print(" no of digits="+cnt);
}}