class SwitchDemo5
{
public static void main (String args [])
throws Exception
{
char ch;
System.out.print(" enter any character=");
ch=(char)System.in.read();
switch(ch)
{
case 'S' :
     System.out.println(" Sunday");
        break;
case 'M':
case 'm':
      System.out.println("Monday");
         break;
case'T':
      System.out.println(" Tuesday");
          break;
case 'W':
case 'w':
      System.out.println(" Wednesday");
          break;
case't':
      System.out.println("  Thursday");
           break;
case'F':
case'f':
       System.out.println("Friday");
           break;
case's':
      System.out.println(" saaturday");
          break;
default:
        System.out.println(" not day");
}}}