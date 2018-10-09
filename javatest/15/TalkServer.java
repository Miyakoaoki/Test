import java.io.*;
import java.net.*;
public class TalkServer{
    public static void main(String[] args){
        try{
         ServerSocket server=new ServerSocket(4700);
         Socket socket=server.accept();
         BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
         String str=br.readLine();
         System.out.println(str);
         br.close();
               socket.close();
         }catch(IOException e){e.printStackTrace();}
         catch(Exception e){e.printStackTrace();}
    }
}