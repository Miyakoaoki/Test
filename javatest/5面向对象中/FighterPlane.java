
class FighterPlane
{
   private String name;
   private int missileNum;
   public  void setName(String _name){
       if(_name != null){
          name = _name.trim();
	}
   }
   public void setNum(int _missileNum){
      if(_missileNum > 0 ){
	  missileNum = _missileNum;
      } 
   }
   public  void fire(){
       if (missileNum>0){
	  System.out.println("now fire a missile !");
       }
       else{
	  System.out.println("No missile left !");
       }
   }
   public static void main(String args [])
   {
   	 test a=new test();
 
		
		 a.salary=-1200;
		 System.out.println(a.salary); 
   	 
   }
      
}
