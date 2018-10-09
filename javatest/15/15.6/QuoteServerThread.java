import java.io.*;
import java.net.*;
import java.util.*;
public class QuoteServerThread extends Thread//服务器线程
{  protected DatagramSocket socket=null;//记录和本对象相关联的DatagramSocket对象
   protected BufferedReader in=null;//用来读文件的一个Reader
   protected boolean moreQuotes=true;//标志变量，是否继续操作
	  public QuoteServerThread() throws IOException {//无参数的构造函数
	    this("QuoteServerThread");//以QuoteServerThread为默认值调用带参数的构造函数
	  }
	  public QuoteServerThread(String name) throws IOException {
		super(name); //调用父类的构造函数
		socket=new DatagramSocket(4445);//在端口4445创建数据报套接字		
		in= new BufferedReader(new InputStreamReader(System.in));
}	
	 public void run() //线程主体
	 {
		while(moreQuotes) {
			try{
				byte[] buf=new byte[256]; //创建缓冲区
				DatagramPacket packet=new DatagramPacket(buf,buf.length);
				//由缓冲区构造DatagramPacket对象
				socket.receive(packet); //接收数据报				
				//打印出客户端发送的内容
				System.out.println(new String(packet.getData())); 
				//从屏幕获取输入内容，作为发送给客户端的内容
				String dString= in.readLine();    
				//如果是bye,则向客户端发完消息后退出
				if(dString.equals("bye")){moreQuotes=false;}
				buf=dString.getBytes();//把String转换成字节数组，以便传送
				//从Client端传来的Packet中得到Client地址
				InetAddress address=packet.getAddress();
				int port=packet.getPort(); //端口号
				//根据客户端信息构建DatagramPacket
				packet=new DatagramPacket(buf,buf.length,address,port);
				socket.send(packet); //发送数据报
			}catch(IOException e) { //异常处理
			    e.printStackTrace(); //打印错误栈
				moreQuotes=false; //标志变量置false，以结束循环
			}
		 }
		 socket.close(); //关闭数据报套接字\
	   }	
}
