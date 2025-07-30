import java.util.*;
class SearchArray_2
{
public static void main (String args[])
{
String s1;
int i,j,k,flg,cnt;
Scanner sc=new Scanner(System.in);
System.out.print(" enter any String=");
s1=sc.next();
char a[]=s1.toCharArray();
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
{
cnt++;
}
}
System.out.println(a[i]+"="+cnt);
}
}
}
}