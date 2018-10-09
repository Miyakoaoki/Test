public class MyThread implements Runnable {
    public static void main ( String args[] ) {                
        MyThread my = new MyThread();                          //(1)
        Thread a = new Thread(my);                             //(2)
        a.start();                                                //(3)
        System.out.println("This is main thread.");        //(4)
    }
    public void run() {
        System.out.println("This is another thread.");    //(5)
    }                                                          
}
