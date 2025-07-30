  /*Write a Java program to create a  vehicle class hierarchy. The base class should be  Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.*/


import java.util.*;
class vehicle
  {
    private float fue;
    private int d;
    private float sp;
  public void calculate(float x,int y,float z)
   {
      fue=x;
      d=y;
      sp=z;
   }
  public void show()
    {
      System.out.println("fuel efficiency="+fue+"mpg");
      System.out.println("distance traveled="+d+"KM");
      System.out.println("maximum speed="+sp+"KMPH");
    }
  }
 
//---------------------------------------------------------------------------------
class Truck extends vehicle
   {
     private String m;
     private int yea;
     private String fue;
      
     public void Truck_info(String x,int y,String z)
       {
         m=x;
         yea=y;
         fue=z;
       }
    
     public void showTruck()
    {
      System.out.println("Truck model="+m);
      System.out.println("model year="+yea);
      System.out.println("fuel type="+fue);
    }
  }
//----------------------------------------------------------------------------------

 class Car extends vehicle
   {
     private String m;
     private int yea;
     private String fue;
      
     public void Car_info(String x,int y,String z)
       {
         m=x;
         yea=y;
         fue=z;
       }
    
     public void showCar()
    {
      System.out.println("Car model="+m);
      System.out.println("model year="+yea);
      System.out.println("fuel type="+fue);
    }
  }
//----------------------------------------------------------------------------------


 class Motorcycle extends vehicle
   {
     private String m;
     private int yea;
     private String fue;
      
     public void Motorcycle_info(String x,int y,String z)
       {
         m=x;
         yea=y;
         fue=z;
       }
    
     public void showMotorcycle()
    {
      System.out.println("Motorcycle model="+m);
      System.out.println("model year="+yea);
      System.out.println("fuel type="+fue);
    }
  }

//----------------------------------------------------------------------------------


class practice_2
 {
   public static void main(String args[])
    {
      vehicle v=new vehicle();
      Truck t=new Truck();
      Car c=new Car();
      Motorcycle m=new Motorcycle();
     t.Truck_info("TATA",2008,"petrol");
     t.showTruck();
     v.calculate(8.07f,129,80);
     v.show();
     System.out.println("---------------------------------------------");
     

     c.Car_info("TATA,Altroz",2022,"disel");
     c.showCar();
     v.calculate(2.37f,129,110);
     v.show();
     System.out.println("---------------------------------------------");
     

      m. Motorcycle_info("HONdA,Unocorn",2023,"petrol");
     m.showMotorcycle();
     v.calculate(2.0f,129,120);
     v.show();
     System.out.println("---------------------------------------------");

      
    }
}