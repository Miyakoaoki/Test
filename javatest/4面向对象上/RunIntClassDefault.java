class IntClass 
    {int value;
     IntClass(){
	          
      }    
    }  
public class RunIntClassDefault 
 {
   public static IntClass getInstance()
   {
     IntClass s = new IntClass (); //ϵͳ����ȱʡ��IntClass�Ĺ��췽��
     s.value=8;
     return  s; 
   } 
   public static void main(String args[])
   {    
     IntClass a = getInstance();
     System.out.println(a.value);     
   }
} 
