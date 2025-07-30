class Rectangle
{
int len;
int wid;
void show()
{
System.out.println("length="+len);
System.out.println("width="+wid);
}
}
class ClassDemo1
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.len=10;
r1.wid=20;
System.out.println(" Rectangle information");
r1.show();
int a=r1.len*r1.wid;
System.out.println(" Area="+a);
}}