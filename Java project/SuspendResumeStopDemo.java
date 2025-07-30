class MyThread extends Thread
{
  String name;
  public MyThread(String x)
   {
    
    name=x; 
    start();
   }
   public void run()
   {
     System.out.println("Beginning of "+name+"Thread");
      for(int i=0;i<=5;i++)
        {
         System.out.print(name+"="+i);
          try
            {
              Thread.sleep(1000);
            } catch (Exception e){}
         System.out.println("End of"+name+"Thread");
       }
}   }
   //====================================
 class SuspendResumeStopDemo
  {
      public static void main(String args[])
        throws Exception
        {
            System.out.println("Beginning of main Thread");
           MyThread  m1=new  MyThread ("java");
           //MyThread  m2=new  MyThread ("php");
           System.out.println("main pause for two seconds");
            Thread.sleep(2000);
             m1.resume();
             m1.suspend();
            System.out.println("End of main Thread");
         }
}
            
            