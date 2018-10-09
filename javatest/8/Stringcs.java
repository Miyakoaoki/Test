public class Stringcs {
  public void changePara(String s){
  	s=s+"a";
  }
  public void invoke(){
  	String s="b";
  	changePara(s);
  	System.out.println(s);
  }
  public static void main(String[] args){
    Stringcs x = new Stringcs(); 	
     x.invoke();
  
  }
}
