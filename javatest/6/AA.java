class A
  {
    int x=4;int y=1;
    public void Printme(int x)
      { System.out.println("x="+this.x+" y="+y);
        System.out.println("class name: "+getClass().getName());
      }
  }
public class AA extends A
  { int x;
    public void Printme()
      { int z=super.x+6;
        super.x = 5;
        super.Printme(x); 
        System.out.println("I am an "+getClass().getName()); 
        x=6;
        System.out.println(" z="+z+" x="+x+" super.x="+super.x +" y="+y+"super.y="+y);
      }
   public static void main(String arg[])
     { //int k;
       A p1=new A();
       AA p2=new AA();
       p1.Printme();
       p2.Printme();
    }
 }
