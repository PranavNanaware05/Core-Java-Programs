import java.util.*;
class String12
{
public static void main(String args[])
{
String s1;
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.nextLine();
for(i=0;i<s1.length();i++)
{
for(j=0;j<=i;j++)
System.out.print(s1.charAt(j));
System.out.print("\n");
}
for(i=s1.length()-2;i>=0;i--)
{
for(j=0;j<=i;j++)
System.out.print(s1.charAt(j));
System.out.print("\n");
}
}}