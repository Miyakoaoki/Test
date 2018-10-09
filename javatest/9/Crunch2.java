public class Crunch2 implements Runnable{
   public int x;
   public static void main(String args[]){
   	Crunch2 r1=new Crunch2();
   	Thread t1=new Thread(r1);
   	Thread t2=new Thread(r1);
   	t1.start();
   	t2.start();
   	
   }
   public void run(){
   	int hold;
   	for(;;){
   		synchronized(this){
   			hold=x+1;
   			try{
   				Thread.sleep(1000);
   			}catch(InterruptedException e){}
   		   x=hold;
   		   System.out.println(Thread.currentThread().getName()+"  value is now  "+x);
   		}
   	}
   }
   

	
}