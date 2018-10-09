class parent{
    //final void show()
    static void show()
   // void show()
    {
		System.out.println("non-static method in Test");
	}
}
public class Son extends parent{
    // void show()
    static void show()
	{
		System.out.println("overriding non-static method");
	}
	public static void main(String [] args){
		Son a=new Son();
		a.show();
	}
	
	
}