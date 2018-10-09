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
		button=new JButton("发送");
		button.setBounds(50,50,80,30);

		button.addActionListener(this);
		add(button);	
	}
	public void actionPerformed(ActionEvent e)
	{
		//得到当前运行页的环境上下文AppletContext对象，再获得另一个Applet
		SecondApplet another=(SecondApplet)getAppletContext().getApplet("SecondApplet");
		if(another!=null)
		{
		  	another.draw(message.getText());
		}
	}
}