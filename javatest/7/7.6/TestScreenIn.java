import java.io.*;
class TestScreenIn{
   public static void main(String[] args) {
	try{
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
		for(int j=0;j<10;j++){
			System.out.println(e[j]);
		}
		
	}
	catch(IOException e){
	//e.printStackTrace();
	System.out.println("ÏµÍ³IOÓÐ´íÎó");
	}
   }
}