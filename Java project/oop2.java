/*Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.*/

import java.util.*;
 class Employee
  { 
     public String name;
     private String jt;
     public int s;
      int per;
      int us;
     public Employee( String x,String y,int z)
        {
           name=x;
           jt=y;
           s=z;
           System.out.println("name      ="+name);
           System.out.println("job tittle="+jt);
           System.out.println("Salary    ="+s);
           
        }
      public void getSalary(int x)
        {
           per=x;
           us=s+s*per/100;
           System.out.println("name              ="+name);
           System.out.println("job tittle        ="+jt);
           System.out.println("Salary            ="+s);
            System.out.println("updated salary   ="+us);
        }

          
}
class oop2
{
  public static void main(String args[])
    {
       Employee a=new Employee("pranav","developer",40000);
        
       Employee a1=new Employee("nihal","Designer",30000); 
        System.out.println("updated Salary.....................");

          a.getSalary(8); 
          a1.getSalary(4); 
     }
}  