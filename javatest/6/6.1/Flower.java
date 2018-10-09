public class Flower{
	private int petalCount=0;
	private String s=new String("null");
	Flower(int petals){
		petalCount=petals;
		System.out.println("Constructor int"+petalCount);
	}
	Flower(String ss){
	
		System.out.println("Constructor String"+ss);
		s=ss;
	}
	Flower(String s,int petals){
    	this(petals);
		this.s=s;
	
	//	this(petals);
	//	System.out.println(this.s);
		System.out.println("String &int args");
	}
	
    	public void test() {
		  	System.out.println("s="+this.s);
		}
	
	public static void main(String [] args)
	{   
	      Flower f=new Flower("fgfd",8);
	         f.test();
	        
		}
}