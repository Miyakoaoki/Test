import java.io.*;
public class FileApp2 
{
   public static void main(String [] args){
   	byte buffer[]=new byte[2056];
   	try{
   		
   		while(true){
   		
   		int bytes=System.in.read(buffer,0,2056);
   		String str=new String(buffer,0,bytes);
   		System.out.println("-->"+str+";"+bytes+";"+str.length());
   		}	
   	}catch(Exception e){
   		String err=e.toString();
   		System.out.println(err);
   	}
   	
   }
   
   
   
}
