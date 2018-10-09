import java.applet.Applet;
import java.awt.*;
public class TestApplet extends Applet{
      int i=0;
      public void paint(Graphics g){
           g.setFont(new Font("¿¬Ìå_GB2312",Font.BOLD,50));
            g.setColor(Color.green);
            g.drawString(String.valueOf(i),50,50);
            i=++i%10;
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){}
            repaint();    
      }
}