import java.util.*;
class Bank
{
private int acno;
private String name;
private float balance;
Scanner sc=new Scanner(System.in);

public void inputdata()
{
System.out.print(" enter account number=");
acno=sc.nextInt();
System.out.print(" enter a name=");
name=sc.next();
System.out.print(" enter balance=");
balance=sc.nextFloat();
System.out.println("----------------------------------------------------");
}
public void showdata()
{
System.out.println("  account number="+acno);
System.out.println("  name="+name);
System.out.println("  balance="+balance);
System.out.println("-----------------------------------------------------");
}
public void deposite()
{
float amt;
System.out.println("enter deposite amount=");
amt=sc.nextFloat();
balance=balance+amt;
System.out.println(" amount deposited successfully............!\n total amount is="+balance);
System.out.println("--------------------------------------------------------");
}


public void withdraw()
{
float amt;
System.out.println("enter withdraw amount=");
amt=sc.nextFloat();
balance=balance-amt;
System.out.println(" amount withdraw successfully............!\n total amount is="+balance);
System.out.println("-----------------------------------------------------------");
}
}
class ClassDemo8
{
public static void main(String args[])
{
Bank a=new Bank();
System.out.println(" enter account information");
a.inputdata();
System.out.println(" account information");
a.showdata();
a.deposite();
a.withdraw();
}}
