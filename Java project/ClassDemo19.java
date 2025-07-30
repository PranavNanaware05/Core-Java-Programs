class Rectangle            //this reference
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
System.out.println(" length="+len);
System.out.println(" width="+wid);
}
public Rectangle max(Rectangle x)
{
int a=this.len+this.wid;
int b=x.len+x.wid;
if(a>b)
return this;
else
return x;
}
}
class ClassDemo19
{
public static void main(String args[])
{
Rectangle r3;
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.setdata(10,20);
r2.setdata(25,10);
r3=r1.max(r2);
System.out.println("object r1");
r1.showdata();
System.out.println("object r2");
r2.showdata();
System.out.println(" max object");
r3.showdata();
}}
