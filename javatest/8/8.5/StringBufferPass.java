public class StringBufferPass{
  private static StringBuffer AppchangeStr(StringBuffer s){
	  return s.append("xxxWorld");
  }
  private static StringBuffer DeletechangeStr(StringBuffer s){
	  return s.delete(3,5);
  }
  private static StringBuffer InsertchangeStr(StringBuffer s){
	  return s.insert(2,"YYYYY");
  }
  public static void main(String[] args){
    StringBuffer s = new StringBuffer("Hello");     
	System.out.println(AppchangeStr(s));
	System.out.println(DeletechangeStr(s));
	System.out.println(InsertchangeStr(s));
  }
}
