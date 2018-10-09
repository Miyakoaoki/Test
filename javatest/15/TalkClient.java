import java.io.*;
import java.net.*;
public class TalkClient{
    public static void main(String[] args){
          String line;
          try{
          Socket socket=new Socket("127.0.0.1",4700);
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
          line=br.readLine();
           pw.println(line);
          
             br.close();
               pw.close();
               socket.close();
          }catch(IOException e){e.printStackTrace();}
          catch(Exception e){e.printStackTrace();}            
         
    }
}