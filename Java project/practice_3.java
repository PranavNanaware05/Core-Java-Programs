/*Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and  Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.*/

import java.util.*;
class employees
  {
     private int b;
     private String r;
     private String p;
      public void employeeData(int x,String y,String z)
        {
           b=x;
           r=y;
           p=z;  
        }
       public void show()
          {
            System.out.println("bonus="+b);
            System.out.println("performance="+r);
            System.out.println("projects="+p);
           }
    }

class Manager extends employees
 {
     private String name;
     private String add;
     private float salary;
     private String job_title;

   public void Manager_data(String x,String y,float z,String a)
     {
        name=x;
        add=y;
        salary=z;
        job_title=a;
     }
     public void show_Manager()
     {
            System.out.println("name="+name);
            System.out.println("address="+add);
            System.out.println("salary="+salary);
            System.out.println("job tittle="+job_title);
             //show();

       }
    }
//---------------------------------------------------------
class Developer extends employees
 {
     private String name;
     private String add;
     private float salary;
     private String job_title;

   public void Developer_data(String x,String y,float z,String a)
     {
        name=x;
        add=y;
        salary=z;
        job_title=a;
     }
     public void show_Developer()
     {
            System.out.println("name="+name);
            System.out.println("address="+add);
            System.out.println("salary="+salary);
            System.out.println("job tittle="+job_title);
             //show();

       }
    }


//--------------------------------------------------------
class Programmer extends employees
 {
     private String name;
     private String add;
     private float salary;
     private String job_title;

   public void Programmer_data(String x,String y,float z,String a)
     {
        name=x;
        add=y;
        salary=z;
        job_title=a;
     }
     public void show_Programmer()
     {
            System.out.println("name="+name);
            System.out.println("address="+add);
            System.out.println("salary="+salary);
            System.out.println("job tittle="+job_title);
            
            //show();

       }
    }
  

//-------------------------------------------------------
class practice_3
{
  public static void main(String args[])
      {
           employees e=new employees();
           Manager m=new Manager();
            Developer d=new  Developer ();
            Programmer p=new Programmer();
            m.Manager_data("abc","satara",12000,"manager");
            e.employeeData(1000,"good","managing a project");
            m.show_Manager();
            e.show();
            System.out.println("-----------------------------------------");
             d. Developer_data("pqr","pachwad",10000,"developer");
             e.employeeData(500,"average","debugging code in python");
             d.show_Developer();
             e.show();
              System.out.println("-----------------------------------------");
             p.Programmer_data("xyz","pune",12000,"programmer");
            e.employeeData(1200,"better","writing a code");
            p. show_Programmer();
            e.show();
            System.out.println("-----------------------------------------");
        }
}