import java.util.*;
class SearchAll_1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,j,k,cnt,flg;
int a[]=new int[10];
System.out.print(" enter array of size 5=");
for(i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  } 
for(i=0;i<a.length;i++)
  {
    flg=0;
   
for(k=i-1;k>=0;k--)
  {
    if(a[i]==a[k])
     {
       flg=1;
         break;
     }
 }
if(flg==0)
 {
   cnt=1;
   for(j=i+1;j<a.length;j++)
    {
      if(a[i]==a[j])
       cnt++;
     }
     System.out.println(a[i]+"="+cnt);
  }
}}}