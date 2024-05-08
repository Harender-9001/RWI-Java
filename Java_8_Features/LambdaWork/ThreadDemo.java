package Java_8_Features.LambdaWork;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable th1 = () -> {
            //thread body
            for (int i=1;i<=10;i++) {
                System.out.println("2X" + i + " = " + i*2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(th1);
        thread1.setName("My Thread");
        thread1.start();

        Runnable th2 = () -> {
            for (int i=1;i<=10;i++) {
                System.out.println("Value of i is :" + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread2 = new Thread(th2);
        thread2.start();
    }
}
