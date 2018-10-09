//ATM.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ATM extends JFrame{
	private JTextArea messageArea;
	private JPanel buttonPanel;
	private JPanel commandPanel;
	private JButton buttonNumber[]=new JButton[10];
	private String buttonName[]={"1","2","3","4","5","6","7","8","9","0"};
	private JButton queryButton;
	private JButton withdrawButton;
	private JButton enterButton;
	private JButton exitButton;
	private double balance;
	private double accountAmount;
	private String accountNumber="",accountPin="";
	private int enterState=0;
	private String s="";
	
	private Connection myCon;
	private Statement myStatement;
	private ResultSet myResultSet;
	
	public ATM()
	{
		String driverClass = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:account";
         try {
            //�ټ�����������
            Class.forName(driverClass);
          } catch (ClassNotFoundException e) {
            //����������ز��ɹ�����ӡ������Ϣ���˳�
            System.out.println("Can not find driver " + driverClass);
            System.exit( -1);
          }

          try {
            //�ڻ��jdbc ����
            myCon = DriverManager.getConnection(url, "account","");
            //�۴���Statement����
            myStatement = myCon.createStatement();
          
            } catch (SQLException sqe) {
            sqe.printStackTrace();
          }
  
		CreateUI();
	}
	
	private void CreateUI()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		messageArea=new JTextArea();
		messageArea.setBounds(20,16,250,80);
		messageArea.setText("��ӭʹ��ATM���������ʺ�:\n");
		messageArea.setEditable(false);
		contentPane.add(messageArea);
		
		buttonPanel=new JPanel();
		buttonPanel.setBounds(24,110,140,120);
		buttonPanel.setLayout(new GridLayout(4,3,5,5));
		contentPane.add(buttonPanel);
		
		commandPanel=new JPanel();
		commandPanel.setBounds(180,110,80,120);
		commandPanel.setLayout(new GridLayout(4,1,5,5));
		contentPane.add(commandPanel);
		
		for(int i=0;i<10;i++)
		{
			buttonNumber[i]=new JButton(buttonName[i]);
			buttonNumber[i].addActionListener(new buttonNumber());
			buttonPanel.add(buttonNumber[i]);
		}

		
		queryButton=new JButton("��ѯ");
		queryButton.addActionListener(new queryButtonAction());
		commandPanel.add(queryButton);
		
		withdrawButton=new JButton("ȡ��");
		withdrawButton.addActionListener(new withdrawButtonAction());
		commandPanel.add(withdrawButton);
		
		enterButton=new JButton("ȷ��");
		enterButton.addActionListener(new enterButtonAction());
		commandPanel.add(enterButton);
		
		exitButton=new JButton("�˳�");
		exitButton.addActionListener(new exitButtonAction());
		commandPanel.add(exitButton);

		setTitle("ATM");
		setSize(300,280);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				try{
					myStatement.close();
					myCon.close();
				}catch(SQLException exp){exp.printStackTrace();}
				finally
				{
					System.exit(0);
				}
			}
		});
	}
	class buttonNumber implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		
			if(enterState==0)
				{s=s+e.getActionCommand().charAt(0);
				messageArea.append(e.getActionCommand());}
			else if(enterState==1)
				{s=s+e.getActionCommand().charAt(0);
				messageArea.append("*");}
				else if(enterState==2)
				{s=s+e.getActionCommand().charAt(0);
				messageArea.append(e.getActionCommand());}
		}
	}
	
	class queryButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			messageArea.setText("��ǰ���Ϊ��"+accountAmount);
			messageArea.append("\n\n��Ҫ���������밴ȷ���������밴�˳���");
			enterState=3;
		}
	}
	
	class withdrawButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			messageArea.setText("������ȡ����(ӦΪ50��100������������\n");
			enterState=2;
			s="";			
		}
	}
	
	class exitButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			enterState=0;
			s="";
			accountAmount=0;
			accountNumber="";
			accountPin="";
			messageArea.setText("��ӭʹ��ATM���������ʺ�:\n");
		}
	}
	class enterButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			enterState++;
			enterState%=5;
			if(enterState==1)
			{
				accountNumber=s;
				s="";

				try{
				
					myResultSet=myStatement.executeQuery("SELECT * FROM account WHERE accountNumber='"+accountNumber+"'");
					if(myResultSet.next())
					  messageArea.setText("����������:\n"); 
					else{ 
					  	messageArea.setText("�ʺ�����������������룡\n");
					    enterState=0;
					    }
					}catch(SQLException exp)
					{exp.printStackTrace();}
				}
			if(enterState==2)
			{
				accountPin=s;
				s="";
				try{
				
				if(myResultSet.getString("accountPin").compareTo(accountPin)==0)
				{
					accountAmount=myResultSet.getDouble("accountAmount");
					messageArea.setText("��ѡ���������\n");
				}
				
				else {messageArea.setText("�����������������\n");
						enterState=1;}
				}catch(SQLException exp)
					{
						exp.printStackTrace();
						}
			}
			if(enterState==3)
			{
				balance=Double.parseDouble(s);
				s="";
				if(accountAmount>balance)
				{accountAmount-=balance;

				messageArea.setText("\n��ȴ�������");
				try{
					myStatement.executeUpdate("UPDATE account SET accountAmount="
					+accountAmount+" WHERE accountNumber='"+accountNumber+"'");
				messageArea.setText("\n��ȡ�߳�Ʊ\n���������밴ȷ�����˳��밴ȡ����");
				}catch(SQLException exp)
					{
						exp.printStackTrace();
						}
				}

			 else {messageArea.setText("�Բ������㣡������������!\n");
			 		enterState=2;}	
			}
			if(enterState==4)
			{
				enterState=2;
				s="";
				messageArea.setText("��ѡ���������\n");
			}
		}
	}
	public static void main(String args[])
	{
		ATM atm=new ATM();
	}
	
}