public class MyThread extends Thread {
    public static void main ( String args[] ) {                
        Thread a = new MyThread();                         //(1)
        a.start();                                            //(2)
        System.out.println("This is main thread.");     //(3)
    }
    public void run() {
        System.out.println("This is another thread."); //(4)
    }                                                          
}
