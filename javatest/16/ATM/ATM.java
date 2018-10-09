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
            //①加载驱动程序
            Class.forName(driverClass);
          } catch (ClassNotFoundException e) {
            //驱动程序加载不成功，打印错误信息并退出
            System.out.println("Can not find driver " + driverClass);
            System.exit( -1);
          }

          try {
            //②获得jdbc 连接
            myCon = DriverManager.getConnection(url, "account","");
            //③创建Statement对象
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
		messageArea.setText("欢迎使用ATM，请输入帐号:\n");
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

		
		queryButton=new JButton("查询");
		queryButton.addActionListener(new queryButtonAction());
		commandPanel.add(queryButton);
		
		withdrawButton=new JButton("取款");
		withdrawButton.addActionListener(new withdrawButtonAction());
		commandPanel.add(withdrawButton);
		
		enterButton=new JButton("确定");
		enterButton.addActionListener(new enterButtonAction());
		commandPanel.add(enterButton);
		
		exitButton=new JButton("退出");
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
			messageArea.setText("当前余额为："+accountAmount);
			messageArea.append("\n\n需要继续服务请按确定，否则请按退出！");
			enterState=3;
		}
	}
	
	class withdrawButtonAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			messageArea.setText("请输入取款金额(应为50或100的整数倍）：\n");
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
			messageArea.setText("欢迎使用ATM，请输入帐号:\n");
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
					  messageArea.setText("请输入密码:\n"); 
					else{ 
					  	messageArea.setText("帐号输入错误，请重新输入！\n");
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
					messageArea.setText("请选择服务种类\n");
				}
				
				else {messageArea.setText("密码错误，请重新输入\n");
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

				messageArea.setText("\n请等待。。。");
				try{
					myStatement.executeUpdate("UPDATE account SET accountAmount="
					+accountAmount+" WHERE accountNumber='"+accountNumber+"'");
				messageArea.setText("\n请取走钞票\n继续服务请按确定，退出请按取消！");
				}catch(SQLException exp)
					{
						exp.printStackTrace();
						}
				}

			 else {messageArea.setText("对不起，余额不足！请重新输入金额!\n");
			 		enterState=2;}	
			}
			if(enterState==4)
			{
				enterState=2;
				s="";
				messageArea.setText("请选择服务种类\n");
			}
		}
	}
	public static void main(String args[])
	{
		ATM atm=new ATM();
	}
	
}