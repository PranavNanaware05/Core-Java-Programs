import java.util.*;
class dowhileDemo3
{
public static void main (String args [])
{
int a,fact=1,n;
Scanner sc =new Scanner (System.in);
System.out.print("enter any number=");
n=sc.nextInt();
a=1;
do
{
fact=fact*n;
a++;
}while(a<=n);
System.out.println(" factoral="+fact);
}}