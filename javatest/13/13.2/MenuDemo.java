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
		setTitle("�˵���ʾ");
		setLocation(200,200);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void createMenu()
	{
		menu1=new JMenu("�ļ�(F)");//������һ���˵����
		menu1.setMnemonic('F');//���ÿ�ݼ�
		menu2=new JMenu("��ͼ(V)");//�����ڶ����˵����
		menu2.setMnemonic('V');//���ÿ�ݼ�
		menuItem11=new JMenuItem("��(O)");//�����˵���
		menuItem11.setMnemonic('O');
		menuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,java.awt.event.InputEvent.CTRL_MASK));
		menuItem12=new JMenuItem("����(S)");
		menuItem12.setMnemonic('S');
		menuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,java.awt.event.InputEvent.CTRL_MASK));
		menuItem13=new JMenuItem("�˳�");
		menu1.add(menuItem11);
		menu1.add(menuItem12);
		menu1.addSeparator();
		menu1.add(menuItem13);
		menuItem21=new JCheckBoxMenuItem("��ʾ������",true);
		menuItem22=new JCheckBoxMenuItem("��ʾ��ʾ����",true);
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