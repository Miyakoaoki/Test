//StartWindow.java
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartWindow extends JWindow implements ActionListener
{
	JLabel backGround=new JLabel(new ImageIcon("back.jpg")); //��ʾͼ�εı�ǩ
	JProgressBar progressBar=new JProgressBar(1,100);    //����һ��������
	Timer timer;
	int n=100;
	public StartWindow()
	{
		progressBar.setStringPainted(true);     //�����������ʾ�ı�
		progressBar.setString("���ڼ��س���......");//���ý������ı�
		getContentPane().add(backGround,"Center");//����ǩ��ӵ����ڵ��������
		getContentPane().add(progressBar,"South");//����������ӵ����ڵ��������
		setSize(300,200);             //���ý����С
		toFront();                     //ʹ�����Ƶ���ǰ
		setLocation(200,200);            //���ô��ڵ���ʾλ��
		setVisible(true);               //���ô��ڿɼ�
		timer=new Timer(100,this);      //����ʱ�������ʱ����Ϊ100ms
		timer.addActionListener(this);   //ע���¼�������
		timer.start();     //����ʱ���������ʼ��ʱ��100ms���Զ����������¼�
	}
	public void actionPerformed(ActionEvent e)  //�����¼��������
	{
		if(--n>0)
		{
			progressBar.setValue(100-n);  //���ý������ĵ�ǰֵ
			timer.restart();             //��������ʱ�����
		}
		else{
			timer.stop();          //ֹͣ"��ʱ"
			dispose();            //�رյ�ǰ����
			//�˴��ɼ�����������ڵ���� 
			new MenuDemo();
		}
	}
	public static void main(String args[])
	{
		StartWindow startWindow=new StartWindow();
	}
}
