public class PassValue {
private static int a;
//	 public int c;

	 public static void modify(int a) {
	//	c=a;
		a++;
	 }
	 
	
	public static void main(String [] args) {
		  modify(a);
	  

	  
		  System.out.println(a);
	 }
	 
	 
	 
}
