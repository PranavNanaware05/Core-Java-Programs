/*Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/


import java.util.*;
class  Employee
{
  public float calculateSalary()
     {
       return 0;
     }
}
//--------------------------------------------------------------------
class Manager extends  Employee
{
   private String nm;
   private String roll;
   private float salary;
   private float bs;
   private float ot;
   public void  Manager_Salary(String a,String b,float d,float e)
   
     { 
        nm=a;
        roll=b;
        bs=d;
        ot=e;
     }
    public void show_Manager()
      {
        System.out.println("manager:"+nm);
        System.out.println("roll:"+roll);
        System.out.println("Salary:"+salary);
      }
     public float calculateSalary()
      {
       return salary=bs+ot;  
      }
      
 }


//--------------------------------------------------------------------
class Programmer extends  Employee
{
   private String nm;
   private String roll;
   private float salary;
   private float bs;
   private float ot;
   public void  Programmer_Salary(String a,String b,float d,float e)
   
     { 
        nm=a;
        roll=b;
        bs=d;
        ot=e;
     }
    public void show_Programmer()
      {
        System.out.println("Programmer:"+nm);
        System.out.println("roll:"+roll);
        System.out.println("Salary:"+salary);
      }
     public float calculateSalary()
      {
       return salary=bs+ot;  
      }
      
 }
//-------------------------------------------------------------------
class poly3
 {
   public static void main(String args[])
     {
      Manager m=new Manager();  
      Programmer p=new Programmer();
      m.Manager_Salary("abc","manager",20000,2000);
      m.calculateSalary();
      m.show_Manager();
      p.Programmer_Salary("pqr","programmer",12000,1000);
      p.calculateSalary();
      p.show_Programmer();
    }
}