package Java_Thread;

class Task1 implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] message " + i);
            if(Thread.interrupted()) {
                System.out.println("This thread was interrupted by someone calling this Thread.interrupt()");
                System.out.println("Cancelling task running in thread " + Thread.currentThread().getName());
                System.out.println("After Thread.interrupted() call, JVM reset the interrupted value to: " + Thread.interrupted());
                break;
            }
        }
    }
}
public class InterruptMethodTest {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        final Task1 t1 = new Task1();
        final Thread th1 = new Thread(t1);
        th1.start();
        th1.interrupt();
        System.out.println("Main Thread ended");
    }
}
