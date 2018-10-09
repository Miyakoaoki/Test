import java.io.*;
class TestScreenIn{
   public static void main(String[] args) {
     BufferedReader keyin = new BufferedReader(new 
        InputStreamReader(System.in));
	String c1;
	int i=0;
	String[] e = new String[10];		
	while(i<10){
	    c1 = keyin.readLine();
	    e[i] = c1;			  
	    i++;
	}		  	  
   }

}