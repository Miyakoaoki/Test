public class RethrowNew{
	public static void f() throws Exception{
		System.out.println("originating the exception in f()");
	    throw new Exception("thow from f()");
	}
	
	public static void main(String [] args){
		try{
			f();
		}catch(Exception e){
			System.out.println("caught in main");
			e.printStackTrace();
			throw new NullPointerException("from");
		}
	}
	
	
}