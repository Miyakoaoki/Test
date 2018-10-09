import java.io.*;
import java.net.*;
import java.util.*;
public class QuoteClient {
	public static void main(String[] args) throws IOException
		{
		 if(args.length!=1){
		   //���������ʱ��û�и���Server�����֣���ô��ӡ������Ϣ���˳�
		   System.out.println("Usage:java QuoteClient <hostname>");
		   return;
		 }
		 DatagramSocket socket=new DatagramSocket();//�������ݱ��׽���
		 byte[] buf=new byte[256]; //����������
		 //�������и����ĵ�һ������Ĭ��ΪServer�����֣�ͨ�����õ�Server��IP��Ϣ
		 InetAddress address=InetAddress.getByName(args[0]);
		 //����DatagramPacket����
		 DatagramPacket packet=new DatagramPacket(buf, buf.length, address, 4445);
		 socket.send(packet); //����
		 //�����µ�DatagramPacket���������������ݱ�
		 packet=new DatagramPacket(buf,buf.length);
		 socket.receive(packet); //����
		 //���ݽ��յ����ֽ�����������Ӧ���ַ���
		 String received=new String(packet.getData());
		 //��ӡ���ɵ��ַ���
		 System.out.println("Quote of the Moment:"+received );		 
		 socket.close(); //�ر��׽ӿ�
		}
}