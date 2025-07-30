import java.util.*;
class  String21
{
public static void main(String args[])
{
String s1;

Scanner sc=new Scanner(System.in);
System.out.print(" enter first string=");
s1=sc.nextLine();

//convert string into char array
char a []=s1.toCharArray();

//sort the char array in ascending order
Arrays.sort(a);

//convert sorted character into string
String s2=new String(a);

System.out.println("Ascneding order="+s2);
}}
