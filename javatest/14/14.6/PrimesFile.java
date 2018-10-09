import java.io.*;
public class PrimesFile 
{
    RandomAccessFile raf;
    public static void main(String args[]) throws IOException
    {  (new PrimesFile()).createprime(100);  }
    public void createprime(int max) throws IOException
    {
        raf=new RandomAccessFile("primes.bin","rw");//创建文件对象
        raf.seek(0);                                //文件指针为0
        raf.writeInt(2);                            //写入整型
        int k=3;
        while (k<=max)
        {
            if (isPrime(k))
                raf.writeInt(k);
            k = k+2;  
        }
        output(max);
        raf.close();                                //关闭文件
    }
    //从文件中得到所有已有素数，如果当前的奇数都不能被k整除，说明k为奇数
    public boolean isPrime(int k) throws IOException
    {
        int i=0,j;
        boolean yes = true;
        try
        {   raf.seek(0); 
            //返回文件字节长度，一个int占用四个字节。
            int count = (int)(raf.length()/4);      
            while ((i<=count) && yes)
            {
                if (k % raf.readInt()==0)           //读取整型
                    yes = false;
                else
                    i++;
                raf.seek(i*4);                      //移动文件指针
            }
        } catch(EOFException e)  { }                //捕获到达文件尾异常
        return yes;
    }
    //输出文件当中最大max数下的所有质数
    public void output(int max) throws IOException
    {
        try
        {
            raf.seek(0); 
            System.out.println("[2.."+max+"]中有 "+
                                   (raf.length()/4)+" 个素数:");
            for (int i=0;i<(int)(raf.length()/4);i++)
            {
                raf.seek(i*4); 
                System.out.print(raf.readInt()+"  ");
                if ((i+1)%10==0) System.out.println();  //每10个数换行
            }
        } catch(EOFException e)  { }
        System.out.println();
    }
}
