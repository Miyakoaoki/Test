class Account                              //账户类
{
    volatile private int value;	                 //帐户额
    void put(int i)                        //存入金额
	   {
		value = value + i; 
		System.out.println("存入"+i+" 账上金额为："+value);		
	   }
    int get(int i)                         //取出金额i,返回实际取到金额
    {   
		if (value>i)
				value = value - i;         //取走时，value值减少。
		else                                    //账户金额不够所取时，取走全部所余金额
			{   i = value;
				value = 0;                    
			}
		System.out.println("取走"+i+" 账上金额为："+value);		
     return i;                      
    }    
}
class  Save implements Runnable            
{
    private Account a1;     
    public Save(Account a1)
    {
        this.a1 = a1;
    }
    public void run()
    {
        while(true){
			a1.put(100);			
	    }
    }
}
class Fetch implements Runnable            
{
    private Account a1;
    public Fetch(Account a1)
    {this.a1 = a1 ;}
    public void run()
    {       
		while(true){		
			a1.get(100);			
		}		
    }
}
public class TestCommunicate{
	public static void main(String[] args){
       Account a1 = new Account();
       new Thread(new Save(a1)).start();       
       new Thread(new Fetch(a1)).start();
	}
}
