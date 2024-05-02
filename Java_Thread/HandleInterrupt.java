package Java_Thread;

class Task implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] message " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("This thread was interrupted by someone calling this Thread.interrupt()");
            }
        }
    }
}
public class HandleInterrupt {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        final Task t1 = new Task();
        final Thread th1 = new Thread(t1);
        th1.start();
        th1.interrupt();
        System.out.println("Main Thread ended");
    }
}
