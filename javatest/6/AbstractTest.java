 class A {
    public  void doSomething(){
    	 System.out.println("**");
    }
}
class B extends A {
    public void doSomething() {
        System.out.println("do B");
    }
}
class D extends B{
	public void doSomething(){
		System.out.println("D");
	}
}

class C extends A {
    public void doSomething() {
        System.out.println("do C");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
     
        A a=new A();
              doSome(a);
        a=new B();
              doSome(a); 
        B a3=(B)a; ///
              doSome(a3);
                
        a=new C();
               doSome(a);    
          B b = new B();
               doSome(b);              
           a=b;    
               doSome(a);
  
    }
 public static void doSome(A a) {//’‚¿Ô£¨”√≥Èœº
        a.doSomething();
    }
}

