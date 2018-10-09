

class IntClass 
    {
      int value;           
    }




public class RunIntClass 
 {
   public static void modifyValue(IntClass s,int val)
  { 
   s.value = val;
  } 
   public static void main(String args[])
   {
     IntClass  a = new IntClass();     
     modifyValue(a,8);
     System.out.println(a.value);     
   }
}