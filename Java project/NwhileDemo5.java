class NwhileDemo5
{
public static void main(String args[])
{
int a,n,b;
System.out.print("prime no from 1 to 100");
b=1;
while(b<=100)
{
n=b;
a=2;
while(a<n)
{
if(n%a==0)
break;
a++;
}
if (n==a)
System.out.println(""+b);
b++;
}}}