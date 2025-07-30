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
  System.out.println("Beg of " +name+ " thread");
    for(int a=1;a<=5;a++)
          {
             System.out.println(name+"="+a);
           try
             {
                Thread.sleep(2000);
               } catch (Exception e){}
          }
 System.out.println("end of " +name+ " thread");
}
}
class MyThreadDemo4
{
 public static void main(String args[]) 
 throws Exception
 {
  System.out.println("beg of main thread");
  MyThread m1=new MyThread("Java");
    for(int a=1;a<=5;a++)
          {
             System.out.println("main="+a);
          }
  Thread.sleep(2000);
  System.out.println("end of main thread");
 }
}
                                                                                       