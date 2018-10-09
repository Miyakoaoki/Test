class Uncle{}
class Pare{}
class Pare1 extends Pare{}
class Pare2 extends Pare1{}
class Pare3 {
   	  public static void main(String[] args){
   		Uncle  u  = new Uncle();
		Pare   p  = new Pare();
	 	Pare1  p1 = new Pare1();
	 	Pare2  p2 = new Pare2();
	 	if ( p instanceof Pare)
	 		{System.out.println("p instanceof Pare");}
	 	if (!( p1 instanceof Pare))
	  		 {System.out.println("p1 not instanceof Pare");}
		 else
	   		{System.out.println("p1  instanceof Pare");}
	 	if ( p2 instanceof Pare)
	   		{System.out.println("p2 instanceof Pare");}
	 	if ( p1 instanceof Pare1)
	   		{System.out.println("p1 instanceof Pare1");}
	 	if ( p2 instanceof Pare1)
	   		{System.out.println("p2 instanceof Pare1");}
	 	if ( p1 instanceof Pare2)
	   		{System.out.println("p1 instanceof Pare2");}
		 else
	   		{System.out.println("p1 not instanceof Pare2");}
	 /*	if (p instanceof Uncle)
	 		{System.out.println("p instanceof Uncle");}
	 	else
	 		{System.out.println("p not instanceof Uncle");}*/
	 	if (null instanceof String)
	  		 {System.out.println("null instanceof String");}
	 	else
	   		{System.out.println("null not instanceof String");}
   	  }
}
