class pare{
	int i=3;
	pare(){
		 i=4;
	}
}
class construct2 extends pare{
	int i=8;
	construct2(){
	}
	construct2(int num){
		this();	
	}
	int getSuper(){
		return super.i;
	}
	public static void main(String [] args){
		construct2 ct=new construct2(9);
		System.out.println(ct.i);
		System.out.println(ct.getSuper());
	}
	
	
	
}