class FighterPlane
{
   String name;
   int missileNum;   
   public FighterPlane(String _name,int _missileNum){
	    name = _name;
		missileNum = _missileNum;
   }
   public void fire(){
       if (missileNum>0){
          System.out.println("now fire a missile !");
		  missileNum -= 1; 
       }
       else{
          System.out.println("No missile left !");
       }
   }   
}

class A 
{
    FighterPlane fp;
    public A(FighterPlane fpp){
       this.fp = fpp; //A������ӵ����FighterPlane���������
    }
    public void invoke(){
       //A�ж�������Ϣ��FighterPlane�Ķ���
       System.out.println(fp.name); 
    }
}
public class  Run{
   public static void main(String[] args)
   {  
      FighterPlane ftp = new FighterPlane("su35",10);
	//����A���󣬲���ftp����������Ϊ��������
      A  a   = new A(ftp); 
      //������Ϣ���������ù�ϵ
      a.invoke();
   }
}
