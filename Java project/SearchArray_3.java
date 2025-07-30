import java.util.*;
class SearchArray_3
{
   public static void main(String args[])
{
    String s1;
     int i,j,k,cnt,flg;
  Scanner sc=new Scanner(System.in);
   System.out.print(" enter any String=");
   s1=sc.nextLine();
    StringTokenizer st=new StringTokenizer(s1);
    cnt=0;
while(st.hasMoreTokens())
{
  cnt++;
  st.nextToken();
}
 
 String a[]=new String[cnt];
 st=new StringTokenizer(s1);
     i=0;
while(st.hasMoreTokens())
{
    a[i]=st.nextToken();
     i++;
}
//---------------------------------------------------------------
System.out.println("String="+s1);
 for(i=0;i<a.length;i++)
  {
    flg=0;
   for(k=i-1;k>=0;k--)
    {
      if(a[i].equalsIgnoreCase(a[k]))
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
    if(a[i].equalsIgnoreCase(a[j]))
      cnt++;
  }
 System.out.println(a[i]+"="+cnt);
 }
}
}}