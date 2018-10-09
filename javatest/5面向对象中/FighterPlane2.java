package com.resource;
public class FighterPlane2
{
   private  String name;
   public  int missileNum;  
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
