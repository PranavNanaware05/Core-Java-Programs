class NforDemo36
{
public static void main(String args[])
{
int a,b,c;
for 
(a=1;a<=5;a++)
{
for (c=a;c<=5;c++)
System.out.print(" ");//one space
for(b=1;b<=a;b++)
System.out.print("* ");
System.out.print("\n");
}
for(a=4;a>=1;a--)
{
for(c=a;c<=5;c++)
System.out.print(" ");//one space
for(b=1;b<=a;b++)
System.out.print("* ");
System.out.print("\n");
}}}