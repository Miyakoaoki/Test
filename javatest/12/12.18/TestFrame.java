import java.awt.*;
import java.awt.event.*;
class MyWindowListener implements WindowListener
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("我退出了！");
		e.getWindow().setVisible(false);       //变为不显示
		((Window)e.getComponent()).dispose();  //释放窗口资源
		System.exit(0);                        //结束虚拟系统运行
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
};
class TestFrame extends Frame{
   public static void main(String arg[])
    {
     Frame f =  new Frame("A Test Window");
     f.setSize(250,150);
     f.setVisible(true);
     f.addWindowListener(new MyWindowListener());
    }
}
