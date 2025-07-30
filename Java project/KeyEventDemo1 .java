import java.awt.*;
import java.awt.event.*;
class KeyEventDemo1 extends Frame implements KeyListener,WindowListener
  {
    String s1="";
    Font f1=new Font("Arial",Font.BOLD,20);
     public KeyEventDemo1()
      {
        addKeyListener(this);
        addWindowListener(this);
      }
     public void paint(Graphics g)
      {
        g.setFont(f1);
        g.drawString(s1,10,50); 
      }
      public void keyPressed(KeyEvent ke){}
      public void keyReleased(KeyEvent ke){}
      public void keyTyped(KeyEvent ke)
       {
         char ch;
          ch=ke.getKeyChar();
           s1=s1+ch;
           repaint();
        }
      public void WindowOpened(WindowEvent we){}
      public void WindowClosed(WindowEvent we){}
      public void WindowClosing(WindowEvent we){} {System.exit(0);}
      public void WindowIconified(WindowEvent we){}
      public void WindowDeiconified(WindowEvent we){}
      public void WindowActivated(WindowEvent we){}
      public void WindowDeactivated(WindowEvent we){}
        public static void main(String args[])
         {
          KeyEventDemo1 k1=new KeyEventDemo1();
          k1.setTitle("Key Event");
          k1.setSize(700,500);
          k1.setVisible(true);
         }
 }