import java.io.*;
public class Input1
{
	public static void sumChar(byte[] b){  //��ĸͳ��
	int n=0;
	for (int i=0;i<b.length ;i++ )
	{
    	if(b[i]>='a'&&b[i]<='z') n++;
	}
    	System.out.println("char count="+n);
    }
    public static void main(String args[]) throws IOException
    {  
        System.out.println("Input: ");
        byte buffer[] = new byte[512];         //���뻺����
        int count = System.in.read(buffer);    
//��ȡ��׼����������buffer�������ض�ȡ��
        System.out.println("Output: ");
        for (int i=0;i<count;i++)              //���bufferԪ��ֵ
        {System.out.print(" "+buffer[i]);}
        System.out.println();
        for (int i=0;i<count;i++)              //���ַ���ʽ���buffer
        {System.out.print((char) buffer[i]);}
        System.out.println("count = "+ count); //bufferʵ�ʳ���
	    sumChar(buffer);
    }
}
