import java.io.*;
import java.net.*;
public class TalkServer{
	public static void main(String args[]) {
		try{
			ServerSocket server=null;
			try{ 
				//����һ��ServerSocket�ڶ˿�4700�����ͻ�����
			server=new ServerSocket(4700); 
                           System.out.println("������������");
			}catch(Exception e) {
				System.out.println("can not listen to:"+e); 
				//������ӡ������Ϣ
			}
			Socket socket=null;
			try{
			//ʹ��accept()�����ȴ��ͻ������пͻ������������һ��Socket���󣬲�����ִ��
		           socket=server.accept();
                           System.out.println("���ӿͻ��˳ɹ�");
			}catch(Exception e){
				System.out.println("Error."+e); //������ӡ������Ϣ
			}
			String line;
			//��Socket����õ�����������������Ӧ��BufferedReader����
			BufferedReader is=new BufferedReader(new 
				InputStreamReader(socket.getInputStream()));
			//��Socket����õ��������������PrintWriter����
			PrintWriter os=new PrintWriter(socket.getOutputStream());
			//��ϵͳ��׼�����豸����BufferedReader����
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			//�ڱ�׼����ϴ�ӡ�ӿͻ��˶�����ַ���
			System.out.println("Client:"+is.readLine());			
			line=sin.readLine();//�ӱ�׼�������һ�ַ���
			while(!line.equals("bye")){   //������ַ���Ϊ "bye"����ֹͣѭ��
			   os.println(line);   //��ͻ���������ַ���
			   os.flush();	   //ˢ���������ʹClient�����յ����ַ���
			   System.out.println("Server:"+line);//��ϵͳ��׼����ϴ�ӡ������ַ���
			   //��Client����һ�ַ���������ӡ����׼�����
			   System.out.println("Client:"+is.readLine());
			   line=sin.readLine(); //��ϵͳ��׼�������һ�ַ���
			}//����ѭ��
			os.close(); //�ر�Socket�����
			is.close(); //�ر�Socket������
			socket.close(); //�ر�Socket
			server.close(); //�ر�ServerSocket
		}catch(Exception e){
			System.out.println("Error:"+e);
			//������ӡ������Ϣ
        }
	}
}
