import java.io.*;
public class CharCode 
{  
  public static void printByteArray(String msg,byte[] t){
	System.out.println(msg+"****************");
    for(int i=0;i<t.length;i++){
      System.out.println(Integer.toHexString(t[i]));
    }
  }
  public static void printCharArray(String msg,char[] c){
	System.out.println(msg+"****************");
	for(int i=0;i<c.length;i++){
      System.out.println(Integer.toHexString(c[i]));
    }
  }
  public static void main(String[] args){
	try{
	  String str = "����";
	  System.out.println(str);
	  //unicode�ַ����ж�"����"���ֵĶ�Ӧ����
	  printCharArray("unicode:",str.toCharArray());   
	  //תΪ�����ַ���GBK2312��Ӧ�Ĵ���
	  byte[] b =str.getBytes("GB2312");
	  printByteArray("GB2312",b);
	  //תΪISO8859-1��Ӧ�Ĵ��룬��ΪISO8859-1��Ӣ���ַ�����
	  //û�ж�Ӧ�ĺ��ִ��룬����ת������
	  byte[] m =str.getBytes("ISO8859-1");
	  printByteArray("ISO8859-1",m);
	}
	catch(UnsupportedEncodingException e){
		System.out.println("û����Ӧ���ַ�����");
	}
  }  
}
