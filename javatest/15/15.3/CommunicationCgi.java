import java.io.*;
import java.net.*;

public class CommunicationCgi
{
	public static void main(String[] args) throws Exception
	{
    // ����ָ��������cgi��URL����backwardsΪ�������˵�CGI����
		URL url=new URL("http://www.javasoft.com/cgi-bin/backwards");
		URLConnection connection=url.openConnection();
		connection.setDoOutput(true);//�������������д��Ϣ
		PrintStream out=new PrintStream(connection.getOutputStream());
		out.println("12345"); // �������������
		out.close();
		InputStreamReader ins =
new InputStreamReader(connection.getInputStream());
		BufferedReader in=new BufferedReader(ins);
		String inputLine;
		while((inputLine=in.readLine())!=null)   // �ӷ�����������
		{
			System.out.println(inputLine);
		}
		in.close();
	}
}
