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
  System.out.println("beg of child thread");
  System.out.println("end of child thread");
 }
 class ThreadDemo2
 {
   public static void main(String args[])
   throws Exception
   {
     System.out.println("beg of main thread");
     Thread.sleep(2000);
     System.out.println("end of main thread");
   }
 }








}