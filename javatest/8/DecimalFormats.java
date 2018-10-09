import java.text.*;
public class DecimalFormats{
	public static void main(String [] args){
		DecimalFormat df1=new DecimalFormat("000");
		System.out.println(df1.format(12345.54));
		System.out.println(df1.format(54));
		System.out.println(df1.format(12345));
	
		DecimalFormat df2=new DecimalFormat("#,##0");
		System.out.println(df2.format(54));
		System.out.println(df2.format(12345));
	
		DecimalFormat df3=new DecimalFormat("0.0#%");
		System.out.println(df3.format(4));
		System.out.println(df3.format(1.2345));		
    
    	DecimalFormat df4=new DecimalFormat("this is 0 o''clock");
		System.out.println(df4.format(4));
		
	}
	
}
