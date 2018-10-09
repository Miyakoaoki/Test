import java.applet.Applet;
import java.awt.*;
public class TestApplet extends Applet{
      public void paint(Graphics g){
           g.setFont(new Font("Ώ¬Με_GB2312",Font.BOLD,20));
            g.setColor(Color.red);
            g.drawString("This is a Applet!",50,50)
            
      }
}