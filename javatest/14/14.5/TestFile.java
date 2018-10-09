import java.io.*;
public class TestFile{
    public static void main(String[] args)throws IOException{
        
         FileOutputStream fos=new FileOutputStream("char.txt");
         OutputStreamWriter osw=new OutputStreamWriter(fos);
         BufferedWriter bw=new BufferedWriter(osw);

         bw.write(" ºé¼ªÍ¯");
         bw.newLine();
         bw.write("180");
         bw.newLine();
         bw.close();

         FileInputStream fis=new FileInputStream("char.txt");
         InputStreamReader isr=new InputStreamReader(fis);
         BufferedReader br=new BufferedReader(isr);

         System.out.println("ÐÕÃû£º"+br.readLine());
         System.out.println("Éí¸ß£º"+br.readLine());
         br.close();
    }
}