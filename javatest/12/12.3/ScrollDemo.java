import java.awt.*;
import java.awt.event.*;
public class ScrollDemo  {
	public static void main(String args[])
	{
	  Frame f=new Frame("ScrollPanel"); 
	  //����һ��TextArea�Ķ���û�й�����
                  TextArea  t = new TextArea("",10,50,TextArea.SCROLLBARS_NONE);
                  Button b=new Button("����");
                  Panel p=new Panel();
                  p.add(t);
                  p.add(b);
                  ScrollPane sp= new ScrollPane();  //����һ���������sp    	 
                  sp.add(p);		     //��t���뵽sp��
                  f.add(sp);		     //��sp���뵽f��
                  f.pack();                //������ܵĴ�С��Ӧsp
                  f.setVisible(true);	//�������Ϊ�ɼ� 
	}	
}
