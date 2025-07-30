class MyThread implements Runnable
{
 Thread t1;
 public MyThread()
 {
   t1=new Thread(this);
   t1.start();
 }
 public void run()
 {
   System.out.println("Beginning of child thread");
   System.out.println("End of child thread");
 }
 class ThreadDemo1
 {
  public static void main(String args[])
  {
   System.out.println("Beginning of main Thread");
   MyThread m1= new MyThread();
   System.out.println("End of main thread");
  }
  
 }


}