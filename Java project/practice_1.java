/*Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.*/




import java.util.*;
 class person
  {
    private String FirstName;
    private String LastName;
   public void getFirstName(String x)
    {
      FirstName=x;
    }
   public void getLastName(String x)
    {
      LastName=x;
    }
   public void show()
    {
      System.out.print(FirstName+"\t");
      System.out.print(LastName+",");

    }
 }
  class Employees extends person
    {
     private int id;
     private String jt;
     public void getEmployeeId(int x)
       {
         id=x;
       }
     public void getLastName(String x)
       {
         jt=x;
      }

     public void showdata()
      {
        System.out.print("("+id+") ,");
        System.out.println(jt);

     }
   }
    class practice_1
    {
       public static void main(String args[])
         {
          person p=new person();
          Employees e=new Employees();
          Employees e1=new Employees();
         
          p.getFirstName("pranav");
          p.getLastName("Nanaware");
          p.show();
          e.getEmployeeId(101);
          e.getLastName("developer");
          e.showdata();


         p.getFirstName("Sakshi");
          p.getLastName("gaikwad");
          p.show();
          e1.getEmployeeId(102);
          e1.getLastName("developer");
          e1.showdata();
        }
    }