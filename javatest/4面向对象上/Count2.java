class Value{
	 int b;  //
	static int c;//1
	
	Value(){   //
		c=15;
	}
	Value(int i){
		c=i;
	}
	static void inc(){
		c++;
	}
}
class Count2{
	public static void prt(String s){
		System.out.println(s);
	}
	
	
	Value v=new Value(10);
	
	static Value v1,v2; //2
	
	
	static{//3
		prt("v.c="+v1.c+"  v2.c="+v2.c);  //3.1
		v1=new Value(27);
		prt("v1.c="+v1.c+"  v2.c="+v2.c);  //3.2
		v2=new Value(15);
		prt("v1.c="+v1.c+"  v2.c="+v2.c);  //3.3
		
	}
	
	public static void main(String[] args)
	{
		Value ct=new Value(); ///4
		prt("ct.c="+ct.v.c);//5   c=10
		prt("v1.c="+v1.c+"  v2.c="+v2.c);//
		v1.inc();
		prt("v1.c="+v1.c+"  v2.c="+v2.c);
		prt("ct.c="+ct.v.c);
	}
	
}
