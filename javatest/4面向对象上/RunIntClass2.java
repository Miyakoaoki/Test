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
      return  s; //���÷���
   } 
   public static void main(String args[])
   {
     //���û�����ȥʹ��
     IntClass a = getInstance();
     System.out.println(a.value);     
   }
} 
