class whileDemo10
{
public static void main(String args[])
{
int n;
float a,p;
System.out.print("number       area      perimeter");
n=1;
while(n<=10)
{
a=3.14f*n*n;
p=2*3.14f*n;
System.out.printf("\n%d\t%f\t%f",n,a,p);
n++;

}}}