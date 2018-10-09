import java.io.*;
public class OpenFile 
{
    public static void main(String args[]) throws IOException
    {
        try
        {                                          //创建文件输入流对象
            FileInputStream  rf = new FileInputStream("Student.txt");
            int n=512;
            byte buffer[] = new byte[n];
            while ((rf.read(buffer,0,n)!=-1) && (n>0))   //读取输入流
            {
                System.out.print(new String(buffer));
            }
            System.out.println();
            rf.close();                            //关闭输入流
        }
        catch (IOException ioe)
        { System.out.println(ioe);}
        catch (Exception e)
        { System.out.println(e);}
    }
}
