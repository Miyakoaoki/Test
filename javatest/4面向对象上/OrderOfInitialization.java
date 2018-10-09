class Tag
{
	Tag(int marker)
	{
		System.out.println("Tag:("+marker+")");
	}
}



class Card
{
	Tag t1=new Tag(1);//1定义初始化
	
	Card(){
		System.out.println("Card()");
		t3=new Tag(33);
	}
	
	Tag t2=new Tag(2);//2
	
	void f()
	{
		System.out.println("f()");
	}
	
	Tag t3=new Tag(3);//3
	
}

public class OrderOfInitialization{
	public static void main(String [] args)
	{
		Card a=new Card();//4
	}
	
	//定义初始化在先，构造方法在后
	
}