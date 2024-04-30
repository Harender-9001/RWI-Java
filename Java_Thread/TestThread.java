package Java_Thread;

// thread using Runnable Interface
//class RunnableDemo implements Runnable {
//    private Thread th;
//    private final String threadName;
//
//    RunnableDemo( String name) {
//        threadName = name;
//        System.out.println("Creating " + threadName );
//    }
//
//    public void run() {
//        System.out.println("Running " + threadName );
//        try {
//            for(int i = 4; i > 0; i--) {
//                System.out.println("Thread: " + threadName + ", " + i);
//                // Let the thread sleep for a while.
//                Thread.sleep(50);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Thread " + threadName + " interrupted.");
//        }
//        System.out.println("Thread " + threadName + " exiting.");
//    }
//
//    public void start () {
//        System.out.println("Starting " + threadName );
//        if (th == null) {
//            th = new Thread (this, threadName);
//            th.start ();
//        }
//    }
//}
//public class TestThread {
//    public static void main(String[] args) {
//        RunnableDemo th1 = new RunnableDemo( "Thread1");
//        th1.start();
//
//        RunnableDemo th2 = new RunnableDemo( "Thread2");
//        th2.start();
//    }
//}

// thread using Thread class
class ThreadDemo extends Thread {
    private Thread th;
    private final String threadName;

    ThreadDemo( String name) {
        threadName = name;
        System.out.println("Creating " + threadName );
    }

    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " + threadName );
        if (th == null) {
            th = new Thread (this, threadName);
            th.start ();
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo th1 = new ThreadDemo( "Thread1");
        th1.start();

        ThreadDemo th2 = new ThreadDemo( "Thread2");
        th2.start();
    }
}
