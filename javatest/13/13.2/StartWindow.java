//StartWindow.java
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartWindow extends JWindow implements ActionListener
{
	JLabel backGround=new JLabel(new ImageIcon("back.jpg")); //显示图形的标签
	JProgressBar progressBar=new JProgressBar(1,100);    //创建一个进度条
	Timer timer;
	int n=100;
	public StartWindow()
	{
		progressBar.setStringPainted(true);     //允许进度条显示文本
		progressBar.setString("正在加载程序......");//设置进度条文本
		getContentPane().add(backGround,"Center");//将标签添加到窗口的内容面板
		getContentPane().add(progressBar,"South");//将进度条添加到窗口的内容面板
		setSize(300,200);             //设置界面大小
		toFront();                     //使界面移到最前
		setLocation(200,200);            //设置窗口的显示位置
		setVisible(true);               //设置窗口可见
		timer=new Timer(100,this);      //建立时间组件，时间间隔为100ms
		timer.addActionListener(this);   //注册事件监听器
		timer.start();     //启动时间组件，开始计时，100ms后自动产生动作事件
	}
	public void actionPerformed(ActionEvent e)  //动作事件处理程序
	{
		if(--n>0)
		{
			progressBar.setValue(100-n);  //设置进度条的当前值
			timer.restart();             //重新启动时间组件
		}
		else{
			timer.stop();          //停止"计时"
			dispose();            //关闭当前窗口
			//此处可加入进入主窗口的语句 
			new MenuDemo();
		}
	}
	public static void main(String args[])
	{
		StartWindow startWindow=new StartWindow();
	}
}
