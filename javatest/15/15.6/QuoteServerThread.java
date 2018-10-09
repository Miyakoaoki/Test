import java.io.*;
import java.net.*;
import java.util.*;
public class QuoteServerThread extends Thread//�������߳�
{  protected DatagramSocket socket=null;//��¼�ͱ������������DatagramSocket����
   protected BufferedReader in=null;//�������ļ���һ��Reader
   protected boolean moreQuotes=true;//��־�������Ƿ��������
	  public QuoteServerThread() throws IOException {//�޲����Ĺ��캯��
	    this("QuoteServerThread");//��QuoteServerThreadΪĬ��ֵ���ô������Ĺ��캯��
	  }
	  public QuoteServerThread(String name) throws IOException {
		super(name); //���ø���Ĺ��캯��
		socket=new DatagramSocket(4445);//�ڶ˿�4445�������ݱ��׽���		
		in= new BufferedReader(new InputStreamReader(System.in));
}	
	 public void run() //�߳�����
	 {
		while(moreQuotes) {
			try{
				byte[] buf=new byte[256]; //����������
				DatagramPacket packet=new DatagramPacket(buf,buf.length);
				//�ɻ���������DatagramPacket����
				socket.receive(packet); //�������ݱ�				
				//��ӡ���ͻ��˷��͵�����
				System.out.println(new String(packet.getData())); 
				//����Ļ��ȡ�������ݣ���Ϊ���͸��ͻ��˵�����
				String dString= in.readLine();    
				//�����bye,����ͻ��˷�����Ϣ���˳�
				if(dString.equals("bye")){moreQuotes=false;}
				buf=dString.getBytes();//��Stringת�����ֽ����飬�Ա㴫��
				//��Client�˴�����Packet�еõ�Client��ַ
				InetAddress address=packet.getAddress();
				int port=packet.getPort(); //�˿ں�
				//���ݿͻ�����Ϣ����DatagramPacket
				packet=new DatagramPacket(buf,buf.length,address,port);
				socket.send(packet); //�������ݱ�
			}catch(IOException e) { //�쳣����
			    e.printStackTrace(); //��ӡ����ջ
				moreQuotes=false; //��־������false���Խ���ѭ��
			}
		 }
		 socket.close(); //�ر����ݱ��׽���\
	   }	
}
