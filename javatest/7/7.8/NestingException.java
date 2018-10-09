public class NestingException{
	public static void main(String[] args)
	{int a,b,c;
        a=68; b=2; c=0;
		try{
			   try{
			         c=a/b;
			    } catch(ArithmeticException ee){
				   b=10;	
			   }
		    	
		System.out.println(a+"/"+b+"="+c);   	
		}catch(Exception e){
			e.printStackTrace();
		}
	 }
} 

