class StringBufferDemo
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer(" object oriented");
System.out.println(" 1.string="+sb);
sb.append(" programming language");
System.out.println(" 2.string="+sb);
sb.insert(0,"java");
/*System.out.println("3.String="+sb);
sb.setcharAt(4,"-");*/
System.out.println("4.String="+sb);
sb.setLength(4);
System.out.println("5.String="+sb);
sb.reverse();
System.out.println("6.String="+sb);
}}