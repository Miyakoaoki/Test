import java.io.*;
import java.net.*;
import ServerThread;
public class MultiTalkServer{
	static int clientnum=0; //��̬��Ա��������¼��ǰ�ͻ��ĸ���
	public static void main(String args[]) throws IOException {
		ServerSocket serverSocket=null;
		boolean listening=true;
		try{
			//����һ��ServerSocket�ڶ˿�4700�����ͻ�����
			serverSocket=new ServerSocket(4700); 			
		}catch(IOException e) {
			System.out.println("Could not listen on port:4700.");
			//��������ӡ������Ϣ
			System.exit(-1); //�˳�
		}
		while(listening){ //ѭ������
		  //�������ͻ����󣬸��ݵõ���Socket����Ϳͻ��������������̣߳�������֮
		  new ServerThread(serverSocket.accept(),clientnum).start();
		  clientnum++; //���ӿͻ�����
		}
		serverSocket.close(); //�ر�ServerSocket
	}
}