import java.applet.*;
import java.awt.*;
public class TestApplet extends Applet{
     
      public void paint(Graphics g){
           g.drawString("���������Applet����",10,50);
      }
      public void setRed(){
           setBackground (Color.red); 
      }
        public void setGreen(){
           setBackground (Color.green);
      }
        public void setBlue(){
           setBackground (Color.blue);
      }
}