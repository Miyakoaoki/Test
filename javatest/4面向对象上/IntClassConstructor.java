class IntClass 
    {
      int value; 
      //���幹�췽��������value��ʼ����ע���췽��û�з������͡�
       IntClass(){
	          
      }               
       IntClass(int val){
	       value = val;   
      }               
    }   
    
    
    
    
public class IntClassConstructor
 {
   public static IntClass getInstance()
   { 
     //���ù��췽�����Ӷ�ʡ����s.value����
     IntClass s = new IntClass (8);
     //s.value=8;
     return  s; 
   } 
   public static void main(String args[])
   {     
     IntClass a = getInstance();
     System.out.println(a.value);     
   }
}
