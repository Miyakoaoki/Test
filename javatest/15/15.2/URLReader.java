import java.net.*;
import java.io.*;
public class URLReader {//声明抛出所有例外
  public static void main(String[] args) throws Exception {
	URL tirc = new URL("http://www.jxnu.edu.cn");//构建一URL对象
	//使用openStream得到一输入流并由此构造一个BufferedReader对象
	BufferedReader in = new BufferedReader(new InputStreamReader(tirc.openStream()));	
	String inputLine;
	//从输入流不断的读数据，直到读完为止
	while ((inputLine = in.readLine()) != null) 
		System.out.println(inputLine); //把读入的数据打印到屏幕上
	in.close(); //关闭输入流
  }
}
