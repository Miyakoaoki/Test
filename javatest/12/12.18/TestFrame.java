import java.awt.*;
import java.awt.event.*;
class MyWindowListener implements WindowListener
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("���˳��ˣ�");
		e.getWindow().setVisible(false);       //��Ϊ����ʾ
		((Window)e.getComponent()).dispose();  //�ͷŴ�����Դ
		System.exit(0);                        //��������ϵͳ����
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
