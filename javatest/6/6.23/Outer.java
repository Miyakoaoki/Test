public class Outer
{ 
	public static void main(String[] args) 
	{ 
		new Thread(new Runnable() //����ʵ��Runnable�����������
		{ 
			public void run() 
			{ 
			System.out.println("run"); 
			} 
		}).start(); 
	} 
}
