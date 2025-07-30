import java.util.*;
class ifDemo6
{
public static void main(String args[])
{
int p,s,a;
Scanner sc=new Scanner (System.in);
System.out.print(" enter purchase price=");
p=sc.nextInt();
System.out.print(" enter selling price=");
s=sc.nextInt();
a=s-p;
if(p<s)
{
System.out.println("you got profit="+a);
}
else
{
System.out.println("  you got loss="+a);
}}}