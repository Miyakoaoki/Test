import java.awt.*;
import java.awt.event.*;
class MyButton extends Button
{
     MyButton(String s){
	super(s);
	enableEvents(AWTEvent.ACTION_EVENT_MASK);
	}
	protected void processActionEvent(ActionEvent e){
      System.out.println("°´Å¥"+e.getActionCommand()+"°´ÏÂ£¡");
    }
};
public class TestEvent extends Frame
{      
    public static void main(String arg[])
    {
      Frame f = new Frame("TestEvent");              
	 MyButton b = new MyButton("login");				
	 b.setSize(100,100);
	 f.add(b);              
      f.setBackground(Color.lightGray);        
      f.setVisible(true);                      
	  f.pack();		
    }
}
