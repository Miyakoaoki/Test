class Pare{}
class Pare1 extends Pare{}
class Pare2 {
   public static void main(String[] args){    
	 Pare   p  = new Pare();
	 Pare1  p1 = new Pare1();
	 Pare   pp = p1;
	 if (p1.equals(pp))
	   {System.out.println("p1与pp引用相同");}
	 else
	   {System.out.println("p1与pp引用不同");}
	 if (p.equals(pp))
	   {System.out.println("p与pp引用相同");}
	 else
	   {System.out.println("p与pp引用不同");}
   }
}
