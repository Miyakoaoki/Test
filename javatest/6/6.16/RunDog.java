class ParentDog{	
	public    String dogName;
	public ParentDog(String dogName){
		this.dogName = dogName;		
	}	
}
class SonDog extends ParentDog{	
	public  String dogName;
	public SonDog(String dogName,String parentDogName){
		super(parentDogName);
		this.dogName = dogName;		
	}	
} 
public class RunDog{
   public static void main(String args[]){
	ParentDog  pDog; //①
	SonDog     sDogA,sDogB; //②
	pDog = new ParentDog("Jack");	//③
    System.out.println("pDog的名字是:"+pDog.dogName);
	sDogA = new SonDog("sonA","JackA");
	sDogB = new SonDog("sonB","JackB");//④
    pDog = sDogA;//⑤ 
    System.out.println("pDog的名字是:"+pDog.dogName);       
	System.out.println("sDogA的名字是:"+sDogA.dogName);
	System.out.println("sDogB的名字是:"+sDogB.dogName);
	pDog = sDogB;//⑥
	System.out.println("pDog的名字是:"+pDog.dogName);
	System.out.println("sDogA的名字是:"+sDogA.dogName);
	System.out.println("sDogB的名字是:"+sDogB.dogName);   
  }
}
