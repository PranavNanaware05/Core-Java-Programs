/*Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal....*/


import java.util.*;
class  Animal
 {
   public void eat()
    {
     System.out.println("Animals food");
    }

   public void Sound()
    {
     System.out.println("Animals Sounds");
    }

}  
//------------------------------------------------------------
  
 class Lion extends Animal
   {
     private String eat;
     private String sound;
       public void Lion_set(String x,String y)
          {
            eat=x;
            sound=y;
          }
      public void sound()
         {
           System.out.println("Lion eat "+eat);
           System.out.println("Lion  "+sound);
         }
    }
//---------------------------------------------------

  class Tiger extends Animal
   {
     private String eat;
     private String sound;
       public void Tiger_set(String x,String y)
          {
            eat=x;
            sound=y;
          }
      public void sound()
         {
           System.out.println("Tiger eats "+eat);
           System.out.println("Tiger "+sound);
         }
    }

 //---------------------------------------------------

  class Panther extends Animal
   {
     private String eat;
     private String sound;
       public void Panther_set(String x,String y)
          {
            eat=x;
            sound=y;
          }
      public void sound()
         {
           System.out.println("Panther eats "+eat);
           System.out.println("Panther"+sound);
         }
    }
//-------------------------------------------------

class poly4
 {
   public static void main(String args[])
     {
         Lion l=new Lion (); 
          Tiger t= new  Tiger ();
           Panther p=new  Panther();
         l.Lion_set("meat","roars");
         l.sound();
         t.Tiger_set("meat and sometimes fish","growls");
         t.sound();
         p.Panther_set("meat and small mammals","purrs and sometimes hisses");
         p.sound();
       }
}
