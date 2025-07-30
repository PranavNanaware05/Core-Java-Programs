class MyThread implements Runnable
{
  Thread t1;
 String name;
 public MyThread(String x)
  {   
     name=x;
     t1=new Thread(this);
     t1.start();
  }
 public void run()
  {
    System.out.println("Begining of "+name+"Thread");
    System.out.println("End      of "+name+"Thread");
}
 }
class ThreadDemo3
 {
   public static void main(String args[])
    throws Exception    
     {
       System.out.println("Begining of main Thread");
       MyThread m1=new MyThread("java");
        Thread.sleep(2000);
       System.out.println("end of main Thread");
    }
}
