import java.util.*;
class forDemo9
{
public static void  main(String args[])
{
int a,x,n,z=1;
Scanner sc=new Scanner (System.in);
System.out.print( " enter any two numbers =");
x=sc.nextInt();
n=sc.nextInt();
for (a=1;a<=n;a++)
{
z=z*x;
}
System.out.print(" power="+z);
}}