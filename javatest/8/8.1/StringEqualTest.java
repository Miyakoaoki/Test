public class StringEqualTest {
  public static void main(String[] args){
    String s = new String("Hello"); 	
    String t = new String("Hello");
    if (s==t){
       System.out.println("相等");
    }
    else{
       System.out.println("不相等");
    }
  }
}
