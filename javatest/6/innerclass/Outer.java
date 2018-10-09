class Outer{
       int a;
     public  class Inner{
            int a=20;
            void f(){
                int a=10;
                System.out.println(a); 
                System.out.println(this.a);
                System.out.println(Outer.this.a);  }
       }
       public static void main(String args []){
       	  Outer a=new Outer();
       	  Outer.Inner b=a.new Inner();
         	 b.f();
       	   
       	}
 }
