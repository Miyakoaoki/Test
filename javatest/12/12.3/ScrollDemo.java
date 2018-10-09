import java.awt.*;
import java.awt.event.*;
public class ScrollDemo  {
	public static void main(String args[])
	{
	  Frame f=new Frame("ScrollPanel"); 
	  //生成一个TextArea的对象，没有滚动条
                  TextArea  t = new TextArea("",10,50,TextArea.SCROLLBARS_NONE);
                  Button b=new Button("发送");
                  Panel p=new Panel();
                  p.add(t);
                  p.add(b);
                  ScrollPane sp= new ScrollPane();  //生成一个滚动面板sp    	 
                  sp.add(p);		     //将t加入到sp中
                  f.add(sp);		     //将sp加入到f中
                  f.pack();                //调整框架的大小适应sp
                  f.setVisible(true);	//将框架设为可见 
	}	
}
