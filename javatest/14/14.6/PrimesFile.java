import java.io.*;
public class PrimesFile 
{
    RandomAccessFile raf;
    public static void main(String args[]) throws IOException
    {  (new PrimesFile()).createprime(100);  }
    public void createprime(int max) throws IOException
    {
        raf=new RandomAccessFile("primes.bin","rw");//�����ļ�����
        raf.seek(0);                                //�ļ�ָ��Ϊ0
        raf.writeInt(2);                            //д������
        int k=3;
        while (k<=max)
        {
            if (isPrime(k))
                raf.writeInt(k);
            k = k+2;  
        }
        output(max);
        raf.close();                                //�ر��ļ�
    }
    //���ļ��еõ��������������������ǰ�����������ܱ�k������˵��kΪ����
    public boolean isPrime(int k) throws IOException
    {
        int i=0,j;
        boolean yes = true;
        try
        {   raf.seek(0); 
            //�����ļ��ֽڳ��ȣ�һ��intռ���ĸ��ֽڡ�
            int count = (int)(raf.length()/4);      
            while ((i<=count) && yes)
            {
                if (k % raf.readInt()==0)           //��ȡ����
                    yes = false;
                else
                    i++;
                raf.seek(i*4);                      //�ƶ��ļ�ָ��
            }
        } catch(EOFException e)  { }                //���񵽴��ļ�β�쳣
        return yes;
    }
    //����ļ��������max���µ���������
    public void output(int max) throws IOException
    {
        try
        {
            raf.seek(0); 
            System.out.println("[2.."+max+"]���� "+
                                   (raf.length()/4)+" ������:");
            for (int i=0;i<(int)(raf.length()/4);i++)
            {
                raf.seek(i*4); 
                System.out.print(raf.readInt()+"  ");
                if ((i+1)%10==0) System.out.println();  //ÿ10��������
            }
        } catch(EOFException e)  { }
        System.out.println();
    }
}
