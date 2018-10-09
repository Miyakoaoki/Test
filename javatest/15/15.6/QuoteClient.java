import java.io.*;
import java.net.*;
import java.util.*;
public class QuoteClient {
	public static void main(String[] args) throws IOException
		{
		 if(args.length!=1){
		   //如果启动的时候没有给出Server的名字，那么打印出错信息并退出
		   System.out.println("Usage:java QuoteClient <hostname>");
		   return;
		 }
		 DatagramSocket socket=new DatagramSocket();//创建数据报套接字
		 byte[] buf=new byte[256]; //创建缓冲区
		 //由命令行给出的第一个参数默认为Server的名字，通过它得到Server的IP信息
		 InetAddress address=InetAddress.getByName(args[0]);
		 //创建DatagramPacket对象
		 DatagramPacket packet=new DatagramPacket(buf, buf.length, address, 4445);
		 socket.send(packet); //发送
		 //创建新的DatagramPacket对象，用来接收数据报
		 packet=new DatagramPacket(buf,buf.length);
		 socket.receive(packet); //接收
		 //根据接收到的字节数组生成相应的字符串
		 String received=new String(packet.getData());
		 //打印生成的字符串
		 System.out.println("Quote of the Moment:"+received );		 
		 socket.close(); //关闭套接口
		}
}
