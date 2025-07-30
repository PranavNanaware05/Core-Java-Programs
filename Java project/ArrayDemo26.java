import java.util.*;
class ArrayDemo26
{
public static void main(String args[])
{
int oct[]=new int[32];
int a,n,top=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
while(n!=0)
{
a=n%8;
n=n/8;
oct[top]=a;
top++;
}
System.out.print(" octal number=");
for(a=top-1;a>=0;a--)
System.out.print(oct[a]);
}}