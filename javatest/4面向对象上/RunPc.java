import java.awt.*;
import java.applet.*;
class Pc
	{
	  double  ad=10;
	}
public class  RunPc  extends Applet
{
	public void paint(Graphics g)
	{
		Pc m=new Pc();
		Pc m1=new Pc();
		m.ad=0.2;
		g.drawString("m1="+m1.ad,20,50);
		g.drawString("Pc="+Pc.ad,20,70);
		g.drawString("m="+m.ad,20,90);
      
       m1.ad=1.5;
        g.drawString("m1="+m1.ad,80,50);
	//	g.drawString("Pc="+Pc.ad,80,70);
		g.drawString("m="+m.ad,80,90);
    /*
        Pc.ad=3;
        g.drawString("m1="+m1.ad,150,50);
		g.drawString("Pc="+Pc.ad,150,70);
		g.drawString("m="+m.ad,150,90); 
*/
	}
}
