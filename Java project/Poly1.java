/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.*/


import java.util.*;
class Animal
  {
      public void called_Sound()
        {
          System.out.println("Animals Sound");

        }
 }
  class Bird extends Animal
   {
       public void called_Sound()
         {
             super.called_Sound();

            System.out.println("The bird chirps");
         }
   }
   class cat extends Animal
     {
        public void called_Sound()
           {
             System.out.println("The cat meows");
           }
     }
 class Poly1
  {
    public static  void main(String args[])
     {
          Bird b=new  Bird();
          cat c= new cat();
           b.called_Sound();
           c.called_Sound();
     }
}