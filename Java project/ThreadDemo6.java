class MyThread extends Thread
{  
   String name;
  public MyThread( String x)
   { 
     name=x;
     start();
   }
   public void run()
    {
       System.out.println("Beginnig of "+name+" Thread");
         for(int a=1;a<=5;a++)
           {
              System.out.println(name+"="+a);
              try
                {
                   Thread.sleep(1000);
                 }catch(Exception e){}
             }
               System.out.println("End of "+name+" Thread");
      }
}
 class ThreadDemo6
  {
     public static void main(String args[])
        throws Exception
       {
          System.out.println("Beginning of main Thread");
            MyThread m1=new MyThread("JAVA");
            MyThread m2=new MyThread("PHP");

                Thread.sleep(1000);
           System.out.println("end of main Thread");
        }
  }