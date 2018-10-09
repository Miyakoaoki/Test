class Parent {
      public int getScore(){
         return 3;
      }
      public String getCountryName(){
          return "China";
      }
    }
class Son extends Parent {
      public int getScore(){
          return 4;
      }
    }
public class RunSon{
     public static void main(String args[]){
          Parent  s = new Parent();
          System.out.println(s.getScore());
          System.out.println(s.getCountryName()); 
     }
}
