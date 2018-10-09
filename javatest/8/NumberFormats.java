import java.text.*;
public class NumberFormats{
	public static void main(String [] args){
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(88888.88));
		
	    NumberFormat nf2=NumberFormat.getIntegerInstance();
		System.out.println(nf2.format(88888.88));
		
	    NumberFormat nf3=NumberFormat.getPercentInstance();
		System.out.println(nf3.format(8.2));
		
	}
	

}