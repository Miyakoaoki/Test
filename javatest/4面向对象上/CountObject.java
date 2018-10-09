public class CountObject 
{
    private static  int i=0;
    CountObject(){
       i++;
    }
	public int getI(){
		return i;
	};		
    public static void main(String args[]){
       CountObject t = new CountObject();
       
       t = new CountObject();
	   System.out.println(t.getI());	  
    }
}
