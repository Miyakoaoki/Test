import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuDemo extends JFrame implements ActionListener
{
	JMenuBar menuBar=new JMenuBar();
	JMenu menu1,menu2;
	JMenuItem menuItem11,menuItem12,menuItem13;
	JCheckBoxMenuItem menuItem21,menuItem22;
                 JToolBar tb;
                 JButton b1,b2;
	MenuDemo()
	{
		getContentPane().setLayout(null);
		createMenu();
        createToolBar();
		setTitle("�˵���ʾ");
		setLocation(200,200);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
                 void createToolBar(){
                                  tb=new JToolBar();
                                  b1=new JButton(new ImageIcon("JTable.gif"));
                                  b1.setToolTipText("���ʾ��");
                                  b1.setFocusPainted(false);
                                  b1.setRequestFocusEnabled(false);
                                  b1.addActionListener(this);
                                  tb.add(b1);
                                  b2=new JButton(new ImageIcon("JTree.gif"));
                                  b2.setToolTipText("��ʾ��");
                                  b2.setFocusPainted(false);
                                  b2.setRequestFocusEnabled(false);
                                  b2.addActionListener(this);
                                  tb.add(b2);
                                  tb.setRollover(true);
                                  tb.setBounds(0,0,400,35);
                                  getContentPane().add(tb);
                                  tb.setFloatable(true);
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
		if(e.getSource()==menuItem11||e.getSource()==b1)
		;
		else if(e.getSource()==menuItem12||e.getSource()==b2)
		;
		else if(e.getSource()==menuItem13)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==menuItem21)
		{
			if(menuItem21.getState())
			     tb.setVisible(true);
			else
			     tb.setVisible(false);
			this.invalidate();
		}
	}
	public static void main(String args[])
	{
		new MenuDemo();
	}
}