interface Product{
	static final String MAKER="My Corp";
	static final String PHONE="7963628";
	public int getPrice(int id);
}
class Shoe implements Product{
  public int getPrice(int id)	
   {
	  if(id==1)
	     return 5;
	   else
	     return 10;
	}
   public String getMaker(){
   	   return MAKER;
   }
}
public class Store{
	static Shoe hightop;
	public static void init(){
		hightop=new Shoe();		
	}
	public static void getInfo(Shoe item){
		System.out.println("The Product is made by"+item.getMaker());
		System.out.println("It const is"+item.getPrice(2));
	}
	public static void orderInfo(Product item){
		System.out.println("To order from "+item.MAKER);
	    System.out.println("each item costs"+item.getPrice(2));
	}
	
	
	public static void main(String [] args){
		init();
		getInfo(hightop);
		orderInfo(hightop);
	}
	
}
