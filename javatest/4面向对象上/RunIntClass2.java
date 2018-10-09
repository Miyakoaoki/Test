class IntClass 
 {
      int value;           
    }
public class RunIntClass2 
 {
   public static IntClass getInstance()
   {
     IntClass s = new IntClass ();
     s.value=8;
      return  s; //引用返回
   } 
   public static void main(String args[])
   {
     //调用环境中去使用
     IntClass a = getInstance();
     System.out.println(a.value);     
   }
} 
