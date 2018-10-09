class FighterPlane
{
   String name;
   int missileNum;   
   public FighterPlane(String _name,int _missileNum){
	    name = _name;
		missileNum = _missileNum;
   }
   public void fire(){
       if (missileNum>0){
          System.out.println("now fire a missile !");
		  missileNum -= 1; 
       }
       else{
          System.out.println("No missile left !");
       }
   }   
}

class A 
{
    FighterPlane fp;
    public A(FighterPlane fpp){
       this.fp = fpp; //A对象中拥有了FighterPlane对象的引用
    }
    public void invoke(){
       //A中对象发送消息给FighterPlane的对象
       System.out.println(fp.name); 
    }
}
public class  Run{
   public static void main(String[] args)
   {  
      FighterPlane ftp = new FighterPlane("su35",10);
	//产生A对象，并将ftp对象引用作为参数传入
      A  a   = new A(ftp); 
      //发送消息，产生调用关系
      a.invoke();
   }
}
