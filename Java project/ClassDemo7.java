import java.util.*;
class Gross_Salary
{
private int id;
private String name;
private float bs,ta,da,hra,gs;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.print(" enter id=");
id=sc.nextInt();
System.out.print(" enter name=");
name=sc.next();
System.out.print(" enter basic salary=");
bs=sc.nextInt();
}
public void showdata()
{
System.out.println(" id="+id);
System.out.println(" name="+name);
System.out.println(" basic salary="+bs);
System.out.println(" ta="+ta);
System.out.println(" da="+da);
System.out.println(" hra="+hra);
System.out.println(" gross salary="+gs);
}
public void calculate_gross_salary()
{
ta=bs*5/100;
da=bs*10/100;
hra=bs*15/100;
gs=ta+da+hra+bs;
}
}
class ClassDemo7
{
public static void main(String args[])
{
Gross_Salary a=new Gross_Salary();
System.out.println("enter employee info");
a.input();
a.calculate_gross_salary();
System.out.println("employee info");
a.showdata();
}}