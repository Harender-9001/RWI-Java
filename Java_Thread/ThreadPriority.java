package Java_Thread;

public class ThreadPriority implements Runnable{
    public void run() {
        System.out.println("The running thread priority is :" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
    ThreadPriority th1 = new ThreadPriority();
    ThreadPriority th2 = new ThreadPriority();
    ThreadPriority th3 = new ThreadPriority();
    Thread th4 = new Thread(th1);
    th4.setPriority(Thread.MIN_PRIORITY);
    Thread th5 = new Thread(th2);
    th5.setPriority(Thread.MAX_PRIORITY);
    Thread th6 = new Thread(th3);
    th6.setPriority(Thread.NORM_PRIORITY);
    th4.start();
    th5.start();
    th6.start();
    }
}
