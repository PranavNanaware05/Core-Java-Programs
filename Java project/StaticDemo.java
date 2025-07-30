class Rectangle
{
private int len;
private int wid;
static int height;
public void setdata(int x,int y)
{
len=x;
wid=y;
}
public static void seth(int x)
{
height=x;
}
public void showdata()
{
System.out.println(" length="+len);
System.out.println("width="+wid);
}
public static void showh()
{
System.out.println(" height="+height);
}
public void area()
{
int a=len*wid;
System.out.println("area="+a);
}
public void volume()
{
int v=len*wid*height;
System.out.println("Volume="+v);
}
}
class StaticDemo
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.setdata(10,20);
r2.setdata(15,25);
Rectangle.seth(30);
System.out.println(" object of r1");
r1.showdata();
Rectangle.showh();
r1.area();
r1.volume();

System.out.println(" object of r2");
r2.showdata();
Rectangle.showh();
r2.area();
r2.volume();
}
}