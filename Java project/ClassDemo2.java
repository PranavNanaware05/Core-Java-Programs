class Rectangle
{
private int len;
private int wid;
public void setvalues(int x,int y)
  {
    len=x;
    wid=y;
  }
public void show()
  { 
    System.out.println("length="+len);
    System.out.println("width="+len);
   }
public int area()
   {
     int a=len*wid;
      return a;
    }
}
class ClassDemo2
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.setvalues(10,20);
System.out.println(" Rectangle info");
r1.show();
int a=r1.area();
System.out.println(" area"+a);
}
  }

