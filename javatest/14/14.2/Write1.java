import java.io.*;
public class Write1 
{
    public static void main(String args[])
    {
        try
        {   System.out.print("Input: ");
            int count,n=512;
            byte buffer[] = new byte[n];
            count = System.in.read(buffer);        //��ȡ��׼������
            FileOutputStream  wf = new FileOutputStream("Student.txt");
                                                   //�����ļ����������
            wf.write(buffer,0,count);              //д�������
            wf.close();                            //�ر������
            System.out.println("Save to Write1.txt!");
        }
        catch (IOException ioe)
        { System.out.println(ioe);}
        catch (Exception e)
        { System.out.println(e);}
    }
}
