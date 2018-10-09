import java.io.*;

public class Decode{
  public static void printByteArray(String msg,byte[] t){
	System.out.println(msg+"****************");
    for(int i=0;i<t.length;i++){
      System.out.println(Integer.toHexString(t[i]));
    }
  }
  public static void printCharArray(String msg,char[] c){
	System.out.println(msg+"****************");
	for(int i=0;i<c.length;i++){
      System.out.println(Integer.toHexString(c[i]));
    }
  }
  public static void main(String[] args){
      byte[] b = new byte[6];
	  int t=0,pos=0;
	  String s;
      try
        {
	     while(t!='\n'){
		   t=System.in.read();
		   b[pos]=(byte)t;	     
		   pos++;
		 }
		 printByteArray("±¾µØÂë£º",b);
		 s = new String(b,"GBK");
		 System.out.println(s);
		 printCharArray("unicodeÂë£º",s.toCharArray());		 
	  }
      catch (Exception e)
      {
	    System.out.println(e.getMessage());
	  }	  
  }
}
