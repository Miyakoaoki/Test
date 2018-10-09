import java.io.*;
import java.net.*;

public class CommunicationCgi
{
	public static void main(String[] args) throws Exception
	{
    // 建立指向网络中cgi的URL对象，backwards为服务器端的CGI程序
		URL url=new URL("http://www.javasoft.com/cgi-bin/backwards");
		URLConnection connection=url.openConnection();
		connection.setDoOutput(true);//可以向服务器端写信息
		PrintStream out=new PrintStream(connection.getOutputStream());
		out.println("12345"); // 服务器输出数据
		out.close();
		InputStreamReader ins =
new InputStreamReader(connection.getInputStream());
		BufferedReader in=new BufferedReader(ins);
		String inputLine;
		while((inputLine=in.readLine())!=null)   // 从服务器读数据
		{
			System.out.println(inputLine);
		}
		in.close();
	}
}
