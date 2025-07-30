import java.awt.*;
import java.awt.event.*;
class KeyEventDemo2 extends Frame implements KeyListener,WindowListener
 {
   String s1="",s2"";
    Font f1=new Font("Arial",Font.BOLD,20);
 public KeyEventDemo2
  {
     addKeyListener(this);
     addKeyListener(this);
  }
public void paint(Graphics g)
 {
   g.setFont(f1);
   g.drawString("change Backgound color",50,50);
   g.drawLine(30,60,400,60);
   g.drawString("1.red",60,80);
   g.drawString("2.blue",60,100);
   g.drawString("3.Green",60,120);
   g.drawString("4.Yellow",60,140);
   g.drawString("5.white",60,160);
   g.drawString("6.Exit",60,180);
   g.drawLine(30,190,400,190);   
   g.drawString("Enter your Choice=",60,220);
   g.drawString(s1,260,220);
   g.drawLine(30,240,400,240);
   g.drawString(s2,60,260);
  }
   public void keyPressed(KeyEvent ke){}
   public void keyReleased(KeyEvent ke){}
   public void keyTyped(KeyEvent ke)
   {
      s2="";
      char ch;
      ch=ke.getChar();
      s1=" "+ch;
     if(ch=='1')
      setBackgound(color.Red);
    
     else if(ch=='2')
      setBackgound(color.Blue);
   
      else if(ch=='3')
      setBackgound(color.Green);
   

     else if(ch=='4')
      setBackgound(color.Yellow);
  

       else if(ch=='5')
      setBackgound(color.White);
 
       else if(ch=='6')
         System.exit(0);
        else
          s2="Wrong choice"
            repaint();
         }

            public void windowOpened(WindowEvent we){}
      public void windowClosed(WindowEvent we){}
      public void windowClosing(WindowEvent we){  System.exit(0);}
      public void windowIconified(WindowEvent we){}
      public void windowDeiconified(WindowEvent we){}
      public void windowActivated(WindowEvent we){}
      public void windowDeactivated(WindowEvent we){}
      public static void main(String args[])
         {
          KeyEventDemo1 k1=new KeyEventDemo1();
          k1.setTitle("Key Event");
          k1.setSize(700,500);
          k1.setVisible(true);
         }
 }
 