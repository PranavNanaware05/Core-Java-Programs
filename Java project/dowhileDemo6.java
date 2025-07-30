import java.util.*;
class dowhileDemo6
{
public static void main(String args[])
{
int x,n,a,z=1;
Scanner sc =new Scanner (System.in);
System.out.print(" enter x and =");
x=sc.nextInt();
n=sc.nextInt();
a=1;
do
{
z=x*z;
a++;
}while(a<=n);

System.out.print(z);
}}