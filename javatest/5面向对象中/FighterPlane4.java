package com.resource;
public class FighterPlane4
{
   private  String name;
   private  int missileNum;
   private  static FighterPlane4 fp; 
   private  FighterPlane4(String _name,int _missileNum){
	    name = _name;
		missileNum = _missileNum;
   }
   public static FighterPlane4 getInstance(String _name,int _missileNum){
	    if (fp==null)
	    {
			fp = new FighterPlane4(_name,_missileNum);
	    }
		return fp;
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
