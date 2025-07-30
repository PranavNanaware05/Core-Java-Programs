import java.util.*;
class ArrayDemo28
{
public static void main(String args[])
{
int a[]=new int[6];
int i,sum=0,p=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter marks of 6 subjects=");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
p=sum/6;
System.out.println(" sum of total marks="+sum);
System.out.println(" percentage="+p);


if(p<50)
   System.out.println(" grade=pass class");
else if(p<60)
   System.out.print("grade=second class");
else if(p<75)
   System.out.print("grade=first class");
else 
   System.out.print("grade=distinction");

 }
}