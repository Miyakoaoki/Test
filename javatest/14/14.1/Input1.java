import java.io.*;
public class Input1
{
	public static void sumChar(byte[] b){  //字母统计
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
        byte buffer[] = new byte[512];         //输入缓冲区
        int count = System.in.read(buffer);    
//读取标准输入流放入buffer，并返回读取数
        System.out.println("Output: ");
        for (int i=0;i<count;i++)              //输出buffer元素值
        {System.out.print(" "+buffer[i]);}
        System.out.println();
        for (int i=0;i<count;i++)              //按字符方式输出buffer
        {System.out.print((char) buffer[i]);}
        System.out.println("count = "+ count); //buffer实际长度
	    sumChar(buffer);
    }
}
