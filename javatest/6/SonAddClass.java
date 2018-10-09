class AddClass
 {
  public int x=0,y=0,z=0;
  AddClass (int x) 
    { this.x=x;   }
  AddClass (int x,int y) 
    { this(x);  this.y=y; }  //调用第一个构造方法
  AddClass (int x,int y,int z) 
    { this(x,y); this.z=z; } //调用第二个构造方法
  public int add()
    {return x+y+z; }
 }
public class SonAddClass extends AddClass
  { int a=0,b=0,c=0;
     SonAddClass (int x) 
       {   super(x);      a=x+7;    }
    SonAddClass (int x,int y) 
       {   super(x,y);    a=x+5;   b=y+5;   }
    SonAddClass (int x,int y,int z)
       {   super(x,y,z);  a=x+4;   b=y+4;  c=z+4;}
    
    public int add()
    {System.out.println("super:x+y+z="+super.add());
     return a+b+c;
	 }
    public static void main(String[] args)
    { SonAddClass p1=new SonAddClass (2,3,5); 
      SonAddClass p2=new SonAddClass (10,20);
      SonAddClass p3=new SonAddClass (1);
      System.out.println("a+b+c="+p1.add());
      System.out.println("a+b="+p2.add());
      System.out.println("a="+p3.add());
    }
}

