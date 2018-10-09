abstract class Anonymity 	//定义一个抽象类
{abstract public void fun1();};
 
 class A extends Anonymity {
 

	 }     

public class Outer
{
	 public static void main(String[] args)
	 {
	   new Outer().callInner(
	   	  new Anonymity()  //产生抽象类的匿名具体子类对象
	      {
		   public void fun1()
			 {
			   System.out.println("匿名类测试");
			 }		   
	      }
	    );
	 }
	 public void callInner(Anonymity a)
	 {a.fun1();
	 }
}
