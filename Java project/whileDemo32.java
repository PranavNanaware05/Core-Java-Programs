import java.util.*;
class whileDemo32
{
public static void main(String args[])
{
int a,n,cnt=0;
Scanner sc= new Scanner(System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
a=1;
while(n!=0)
{
cnt++;
n=n/10;
}
System.out.print(" no of digits="+cnt);
}}