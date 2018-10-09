public class MethodTest{
	public static void main(String[] args){
		FirstThread first=new FirstThread();
		SecondThread second=new SecondThread();
	   1  first.start();
	  2	second.start();
		try{
		3	System.out.println("Waiting for first thread to finish...");
		4	first.join();
		5	System.out.println("It's a long wait");
		6	System.out.println("Waking up second thread...");
		7	second.resume();
		8	System.out.println("Waiting for second thread to finisth..");
		9	second.join();
			
		}catch(InterruptedException e){
		}
		System.out.println("I'm ready to finish too..");
	}	
}
class FirstThread extends Thread{
	public void run(){
		try{
		10	System.out.println("First thread starts running");
		11	sleep(10000);
		12	System.out.println("First thread finishes running");
		}catch(InterruptedException e){
		}
	}
}
class SecondThread extends Thread{
	public void run(){
		13 System.out.println("Second threads starts running");
	   14 System.out.println("second threads suspend itself");
	   15 suspend();
	   16 System.out.println("second thread runs again and finish");	
	}	
}

3,13,10,14,11,12,4,15,5
