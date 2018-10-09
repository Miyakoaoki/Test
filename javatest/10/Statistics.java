import java.util.*;
class Couter{
	int i=1;
	public  String toString(){
		return Integer.toString();
	}
}

public class Statistics{
	public static void main(String [] args){
		Hashtable ht=new Hashtable();
		for(int i=0;i<1000;i++){
			Integer r=new Integer((int)(Math.random()*20));
			if(ht.containsKey(r))
				((Couter)ht.get(r)).i++;
			  else	
			    ht.put(r,new Couter());
		}
		System.out.println(ht);
		
	}
	
}