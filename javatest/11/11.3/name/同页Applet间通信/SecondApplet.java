//SecondApplet.java
import javax.swing.*;
import java.awt.*;
import java.applet.*;
public class SecondApplet extends JApplet
{
	public void draw(String s)
	{
		Graphics g=this.getGraphics();
                                  update(g);
		g.drawString(s,50,50);
	}
}