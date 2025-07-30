import java.util.*;

class ifDemo26
{
public static void main(String args[])
{
char ch;
Scanner sc =new Scanner(System.in);
System.out.print(" enter any character=");
ch=sc.nextLine();
if(ch>=65 && ch<=90)
System.out.println(" it is capital alphabet");
else if(ch>=97 && ch<=122)
System.out.println(" it is small alphabet");
else
System.out.print(" it is not an alphabet");
}}