import java.io.*;
public class OpenFile  
{
    public static void main(String args[]) throws IOException
    {
                                              //创建文件输出流对象
            File f=new File("xxzm.txt");
            FileOutputStream  fos = new FileOutputStream(f);
            FilterOutputStream filterout=new FilterOutputStream(fos);
            int[] buffer=new int[]{'a','b','c','d','e','f','g','f','g'};
            for(int i=0;i<buffer.length;i++)
            filterout.write(buffer[i]);
            filterout.close();                            //关闭输出流

    }
}
