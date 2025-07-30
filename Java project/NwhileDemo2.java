class NwhileDemo2
{
public static void main (String args[])
{
int b,n,a,rev;
System.out .print(" number Reverse");
b=225;

while(b<=245)
{
n=b;
rev=0;
while(n!=0)
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
System.out.println(b+"\t"+rev);
b++;
}}}