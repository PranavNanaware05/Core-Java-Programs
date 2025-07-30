/*
class Cmdsquare1
{
public static void main(String args[])
{
int n,sq;
n=Integer.parseInt(args[0]);
sq=n*n;
System.out.println("Number="+n);
System.out.println("Number="+sq);
}
}
*/

/*
class Cmdsquare1
{
public static void main(String args[])
{

int n,sq;
if(args.length!=1)
{
System.out.println("please pass only one number");
System.exit(0);
}
n=Integer.parseInt(args[0]);
sq=n*n;
System.out.println("number="+n);
System.out.println("Square="+sq);
}
}
*/


class Cmdsquare1
{
public static void main (String args[])
{
int n,sq;
if (args.length!=1)
{
System.out.println("please pass only one number");
System.exit(0);
}
System.out.println("have nice day");
try
{
n=Integer.parseInt(args[0]);
sq=n*n;
System.out.println("Number="+n);
System.out.println("Square="+sq);
}catch(Exception X)

{
System.out.println("please pass only one number");
}
System.out.println("end of program");
}
}












