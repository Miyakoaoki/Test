//FirstApplet.java
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class FirstApplet extends JApplet implements ActionListener
{
	JTextField message;
	JButton button;
	public void init()
	{
		setLayout(null);
		message=new JTextField(50);
		message.setBounds(10,10,170,20);
		add(message);		
		button=new JButton("����");
		button.setBounds(50,50,80,30);

		button.addActionListener(this);
		add(button);	
	}
	public void actionPerformed(ActionEvent e)
	{
		//�õ���ǰ����ҳ�Ļ���������AppletContext�����ٻ����һ��Applet
		SecondApplet another=(SecondApplet)getAppletContext().getApplet("SecondApplet");
		if(another!=null)
		{
		  	another.draw(message.getText());
		}
	}
}