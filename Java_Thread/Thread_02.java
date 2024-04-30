package Java_Thread;

public class Thread_02 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread one");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
    Thread_02 th1 = new Thread_02();
    th1.start();
    System.out.println(Thread.currentThread().getName());
    }
}
