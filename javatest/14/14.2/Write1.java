import java.io.*;
public class Write1 
{
    public static void main(String args[])
    {
        try
        {   System.out.print("Input: ");
            int count,n=512;
            byte buffer[] = new byte[n];
            count = System.in.read(buffer);        //读取标准输入流
            FileOutputStream  wf = new FileOutputStream("Student.txt");
                                                   //创建文件输出流对象
            wf.write(buffer,0,count);              //写入输出流
            wf.close();                            //关闭输出流
            System.out.println("Save to Write1.txt!");
        }
        catch (IOException ioe)
        { System.out.println(ioe);}
        catch (Exception e)
        { System.out.println(e);}
    }
}
