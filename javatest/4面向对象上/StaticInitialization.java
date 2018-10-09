class Bow1{
	Bow1(int marker)  
	{
		 System.out.println("Bow1("+marker+")");		 
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}
class Table{
	static Bow1 b1=new Bow1(1); //1
	Table(){    //3
		System.out.println("Table()");
		b2.f(1);
	}
	void f2(int marker)
	{
		System.out.println("f2("+marker+")");		
	}
	static Bow1 b2=new Bow1(2); //2
}
class Cupboard{
	Bow1 b3=new Bow1(3);   //8,10
	static Bow1 b4=new Bow1(4);   //6
	Cupboard()    //9,11
	{
		System.out.println("Cupboard()");
		b4.f(2);
	}
	void f3(int marker){
		System.out.println("f3("+marker+")");
		
	}
	static Bow1 b5=new Bow1(5);   //7
}

public class StaticInitialization{

	static Table t2=new Table();  //4
	static Cupboard t3=new Cupboard();  //5

	public static void main(String [] args)
	{
      //   System.out.println(new Cupboard());
     //  System.out.println(new Cupboard());
	System.out.println("Creating new Cupboard()in main"+new Cupboard());
	   	System.out.println("Creating new Cupboard()in main"+new Cupboard());
	 //   System.out.println("Creating new Cupboard()in main"+new Cupboard());
	    t2.f2(1);
	    t3.f3(1);
	}

	
}