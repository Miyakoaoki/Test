class IntClass 
    {int value;
     IntClass(){
	          
      }    
    }  
public class RunIntClassDefault 
 {
   public static IntClass getInstance()
   {
     IntClass s = new IntClass (); //系统调用缺省的IntClass的构造方法
     s.value=8;
     return  s; 
   } 
   public static void main(String args[])
   {    
     IntClass a = getInstance();
     System.out.println(a.value);     
   }
} 
