/*Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.*/

import java.util.*;
class Shape
 {
   public void calculateArea()
     {
       System.out.println("calculate area");
     }
  }
//---------------------------------------------------
class Rectangle extends Shape
  {
     private int len;
     private int wid;
     private int area;
    
   public void set(int x,int y)
     {
       len=x;
       wid=y;
     }
        
       public void calculateArea() 
     {
        area=len*wid;
        System.out.println("Area of rectangle="+area);

      }
}

//-------------------------------------------------------
class Circle extends Shape

  {
     private int r;
     private float  area;
    public void set_circle(int x)
      {
         r=x;
      }
     public void calculateArea()
        {
          area=2*3.14f*r;
                   
          System.out.println("Area of circle="+area);

        }
}

//----------------------------------------------------------
 class Triangle extends  Shape
  {
     private int b;
     private int h;
      private float  area;
    public void set_Triangle(int x,int y)
      {
         b=x;
         h=y;
      }
     public void calculateArea()
        {
          area=0.5f*b*h;                   
          System.out.println("Area of Triangle="+area);

        }
}
//-------------------------------------------------------------------
 class poly2
  {
      public static void main(String args[])
        {
          
           Rectangle r=new Rectangle();
           Circle c=new Circle();
           Triangle t=new Triangle();
            r.set(10,20);
            r.calculateArea();
            c.set_circle(5);
            c.calculateArea();
            t.set_Triangle(10,20);
            t.calculateArea();
         }
  }