package Java_Thread;

// using thread class
//public class Thread_01 extends Thread {
//    public void run() {
//        System.out.println("Thread is running...");
//    }
//    public static void main(String[] args) {
//        Thread_01 th1 = new Thread_01();
//        th1.start();
//    }
//}

// using Runnable interface
public class Thread_01 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
    Thread_01 th1 = new Thread_01();
    Thread th2 = new Thread(th1);
    th2.start();
    }
}
