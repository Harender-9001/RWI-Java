package Java_Thread;

public class JoinMethodTest extends Thread {
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                // sleeping the thread for 500 melli seconds
                Thread.sleep(500);
                System.out.println("The current thread name is : " + Thread.currentThread().getName());
            }
            // catch block for catching the raised exception
            catch(Exception e) {
                System.out.println("The exception has been caught : " + e);
            }
            System.out.println( j );
        }
    }
    public static void main(String[] args) {
        JoinMethodTest th1 = new JoinMethodTest();
        JoinMethodTest th2 = new JoinMethodTest();
        JoinMethodTest th3 = new JoinMethodTest();

        // thread th1 starts
        th1.start();
        // starting the second thread after when the first thread th1 has ended or died.
        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());

            // invoking the join() method
            th1.join();
        }
        // catch block for catching the raised exception
        catch(Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        // thread th2 starts
        th2.start();

        // starting the th3 thread after when the thread th2 has ended or died.
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }
        // catch block for catching the raised exception
        catch(Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        // thread th3 starts
        th3.start();
    }
}
