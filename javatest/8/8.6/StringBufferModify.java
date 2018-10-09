public class StringBufferModify{
	public static void main (String [] args) {
		StringBuffer a = new StringBuffer ("A");
		StringBuffer b = new StringBuffer ("B");		
		operate(a,b);
		System.out.println(a + "," +b);
	}
	
	static void operate(StringBuffer x, StringBuffer y) {
    	System.out.println(x);
    	System.out.println(y);
		x.append(y);
		System.out.println(x);
		y= x;
		System.out.println(y);
	}
 }
