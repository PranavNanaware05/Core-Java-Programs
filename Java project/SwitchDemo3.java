import java.util.*;
class SwitchDemo3
{
public static void main (String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print(" enter number=");
n=sc.nextInt();
switch(n%2)
{
case 0:
   System.out.println(" even no");
      break;
case 1:
   System.out.println(" odd no");
}
}
} 