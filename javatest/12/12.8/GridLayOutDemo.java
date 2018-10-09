import java.awt.*;
import java.awt.event.*;
public class GridLayOutDemo  {
	public static void main(String args[])
	{
	  Frame f=new Frame("GridLayOutDemo"); 
      f.setLayout(new GridLayout(3,3,10,10)); 
	  f.add(new Button("1"));
	  f.add(new Button("2"));
	  f.add(new Button("3"));
	  f.add(new Button("4"));
	  f.add(new Button("5"));
	  f.add(new Button("6"));
      f.add(new Button("7"));	
	  f.pack();      
      f.setVisible(true);				
	}	
}
