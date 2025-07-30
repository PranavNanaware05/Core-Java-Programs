class Rectangle
{
private int len;
private int wid;
public void setdata(int x,int y)
{
len=x;
wid=y;
}
public void showdata()
{
System.out.println("length="+len);
System.out.println("width="+wid);
}
public void swap(Rectangle x)
{
int z;
z=len;
len=x.len;
x.len=z;

z=wid;
wid=x.wid;
x.wid=z;
}}
class ClassDemo16
{
public static void main(String args[])
{
Rectangle R1=new Rectangle();
Rectangle R2=new Rectangle();
R1.setdata(10,20);
R2.setdata(11,22);
System.out.println(" rectangle object r1=");
R1.showdata();
System.out.println(" rectangle object r2=");
R2.showdata();
R1.swap(R2);
System.out.println(" after swapping ");
System.out.println(" rectangle object r1");
R1.showdata();
System.out.println(" rectangle object r2");
R2.showdata();
}
}