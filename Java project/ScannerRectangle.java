import java.util.*;
class ScannerRectangle
{
public static void main (String args[])
{
int l,w,a,p;
Scanner scr=new Scanner(System.in);
System.out.print(" enter length=");
l=scr.nextInt();
System.out.print("enter width=");
w=scr.nextInt();
a=l*w;
p=(l+w)*2;
System.out.println(" area="+a);
System.out.println(" perimeter="+p);
}
}