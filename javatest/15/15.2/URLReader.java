import java.net.*;
import java.io.*;
public class URLReader {//�����׳���������
  public static void main(String[] args) throws Exception {
	URL tirc = new URL("http://www.jxnu.edu.cn");//����һURL����
	//ʹ��openStream�õ�һ���������ɴ˹���һ��BufferedReader����
	BufferedReader in = new BufferedReader(new InputStreamReader(tirc.openStream()));	
	String inputLine;
	//�����������ϵĶ����ݣ�ֱ������Ϊֹ
	while ((inputLine = in.readLine()) != null) 
		System.out.println(inputLine); //�Ѷ�������ݴ�ӡ����Ļ��
	in.close(); //�ر�������
  }
}
