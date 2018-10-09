import java.awt.*;
import java.awt.event.*;

class TestFrame extends Frame {
   public static void main(String arg[])
    {
     Frame f =  new Frame("A Test Window");
     f.setSize(250,150);
     f.setVisible(true);
	 f.addWindowListener(new WindowListener(){
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Œ“ÕÀ≥ˆ¡À£°");
			e.getWindow().setVisible(false);       
			((Window)e.getComponent()).dispose();  
			System.exit(0);                        
		}
		public void windowActivated(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowDeactivated(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowOpened(WindowEvent e){}
	   }
	 );
    }
}
