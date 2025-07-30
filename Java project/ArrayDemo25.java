import java.util.*;
class ArrayDemo25
{
public static void main(String args[])
{
int bin[]=new int[32];
int a,n,top=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
while(n!=0)
{
a=n%2;
n=n/2;
bin[top]=a;
top++;
}
System.out.print(" binary no=");
for(a=top-1;a>=0;a--)
System.out.print(bin[a]);
}}