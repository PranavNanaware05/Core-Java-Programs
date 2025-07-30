class Population_1
{
public static void main (String args[])
{
int pop,tm,tw,tl,tlm,tlw,ilw,ilm;
pop=100000;
tm=(52*pop)/100;
tw=pop-tm;
System.out.println(" population="+pop);
System.out.println(" total men="+tm);
System.out.println(" total women="+tw);

tl=(48*pop)/100;
tlm=(35*pop)/100;
tlw=tl-tlm;
System.out.println(" total litrate ="+tl);
System.out.println(" total litrate men="+tlm);
System.out.println(" total litrate women="+tlw);

ilm=tm-tlm;
ilw=tw-tlw;
System.out.println(" total ilitrate men="+ilm);
System.out.println(" total ilitrate women="+ilw);
}}