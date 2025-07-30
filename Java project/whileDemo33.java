import java.util.*;

class whileDemo33
{
public static void main (String args[])
{
int a,n,cnt=0,x;
Scanner sc =new Scanner (System.in);
System.out.print(" enter any number=");
n=sc.nextInt();
x=n;
while (n!=0)
{
cnt++;
n=n/10;
}
n=x;
int p,sum=0;
while(n!=0)
{
a=n%10;
p=(int)Math.pow(a,cnt);

sum=sum+p;
n=n/10;
}
System.out.println("sum="+sum);
if(x==sum)
System.out.println(" no is armstrong");
else
System.out.println(" no is  not armstrong");
}
}

