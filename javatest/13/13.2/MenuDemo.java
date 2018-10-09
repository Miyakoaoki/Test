import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuDemo extends JFrame implements ActionListener
{
	JMenuBar menuBar=new JMenuBar();
	JMenu menu1,menu2;
	JMenuItem menuItem11,menuItem12,menuItem13,menuItem14;
	JCheckBoxMenuItem menuItem21,menuItem22;
	MenuDemo()
	{
		getContentPane().setLayout(new BorderLayout());
		createMenu();
		setTitle("菜单演示");
		setLocation(200,200);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void createMenu()
	{
		menu1=new JMenu("文件(F)");//创建第一个菜单组件
		menu1.setMnemonic('F');//设置快捷键
		menu2=new JMenu("视图(V)");//创建第二个菜单组件
		menu2.setMnemonic('V');//设置快捷键
		menuItem11=new JMenuItem("打开(O)");//创建菜单项
		menuItem11.setMnemonic('O');
		menuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,java.awt.event.InputEvent.CTRL_MASK));
		menuItem12=new JMenuItem("保存(S)");
		menuItem12.setMnemonic('S');
		menuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,java.awt.event.InputEvent.CTRL_MASK));
		menuItem13=new JMenuItem("退出");
		menu1.add(menuItem11);
		menu1.add(menuItem12);
		menu1.addSeparator();
		menu1.add(menuItem13);
		menuItem21=new JCheckBoxMenuItem("显示工具栏",true);
		menuItem22=new JCheckBoxMenuItem("显示提示文字",true);
		menu2.add(menuItem21);
		menu2.add(menuItem22);
		menuBar.add(menu1);
		menuBar.add(menu2);
		setJMenuBar(menuBar);
		menuItem11.addActionListener(this);
		menuItem12.addActionListener(this);
		menuItem13.addActionListener(this);		
		menuItem21.addActionListener(this);		
		menuItem22.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==menuItem11)
		;
		else if(e.getSource()==menuItem12)
		;
		else if(e.getSource()==menuItem13)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==menuItem21)
		{
			if(menuItem21.getState())
			;
			else
			;
			this.invalidate();
		}
	}
	public static void main(String args[])
	{
		new MenuDemo();
	}
}