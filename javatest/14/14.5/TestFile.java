import java.io.*;
public class TestFile{
    public static void main(String[] args)throws IOException{
        
         FileOutputStream fos=new FileOutputStream("char.txt");
         OutputStreamWriter osw=new OutputStreamWriter(fos);
         BufferedWriter bw=new BufferedWriter(osw);

         bw.write(" �鼪ͯ");
         bw.newLine();
         bw.write("180");
         bw.newLine();
         bw.close();

         FileInputStream fis=new FileInputStream("char.txt");
         InputStreamReader isr=new InputStreamReader(fis);
         BufferedReader br=new BufferedReader(isr);

         System.out.println("������"+br.readLine());
         System.out.println("��ߣ�"+br.readLine());
         br.close();
    }
}