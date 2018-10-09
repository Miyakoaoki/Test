import java.util.*;
public class TestVector{
	public static void main(String [] args){
		int b=0;
		Vector v=new Vector();
		System.out.println("please enter number:");
		while(true){
			try{
				b=System.in.read();
			}catch(Exception e){
				System.out.println(e.getMessage());	
				}
			if(b=='\r'||b=='\n') break;
			else
			  {
			  	int num=b-'0';
			  	v.addElement(new Integer(num));
			  	}
		}
		int sum=0;
	  // Iterator it=v.iterator();
	 //  while(it.hasNext()){
	  // 	  Integer obj=(Integer)it.next();
	  // 	  sum+=obj.intValue();
	  // 	}
	
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Integer obj=(Integer)e.nextElement();
			sum+=obj.intValue();
			}
		System.out.println(sum);
		
	}

}