 class Outer
{
     private String index="The String is in Outer Class";
	 public class Inner
	 {
		  String index="The String is in Inner Class";
		  void print()
		  {
		   String index="The String is in print Method";
		   System.out.println(index);
		   System.out.println(this.index);
		   System.out.println(Outer.this.index);
		  }
	 }
	 void print()
	 {
		  Inner inner = new Inner();
		  inner.print();
	 }
 
	 Inner getInner()//注意：必须使用此方法创建内部类实例对象
	 {
		 return new Inner();
	 }
}

public class TestOuterAndInner
{
	 public static void main(String[] args)
	 {
	  Outer outer = new Outer();	   //先产生外部类对象
	//Outer.Inner inner = outer.getInner();//内部类前没有public时的访问方法
	  Outer.Inner inner = outer.new Inner(); //利用对象的new方法
	  inner.print();
	 }
}
