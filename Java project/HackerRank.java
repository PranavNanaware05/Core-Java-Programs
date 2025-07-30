import java.util.*;
class HackerRank
{
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    
    n=sc.nextInt();
    if(n%2!=0)
    {
        System.out.println("Weird");
    }
    
   else 
{
if (n>=2 && n<=5)
{
System.out.println(" Not weird");
}
else if(n>=6 && n<=20)
{
System.out.println(" Weird");}
else if(n>20)
{
System.out.println(" Not Weird");
}
}
}}