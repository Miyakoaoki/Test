public class Outer
{ 
	public static void main(String[] args) 
	{ 
		new Thread(new Runnable() //产生实现Runnable的匿名类对象
		{ 
			public void run() 
			{ 
			System.out.println("run"); 
			} 
		}).start(); 
	} 
}
