import java.io.*;
public class FileApp 
{
   public static void main(String [] args){
   	byte buffer[]=new byte[2056];
   	try{
   		FileInputStream fileIn=new FileInputStream("filea.java");
   		int bytes=fileIn.read(buffer,0,2056);
   		String str=new String(buffer,0,bytes);
   		System.out.println(str);
   		
   	}catch(Exception e){
   		String err=e.toString();
   		System.out.println(err);
   	}
   	
   }
   
   
   
}
