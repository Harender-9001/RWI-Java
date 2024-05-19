package Java_8_Features.MethodRef;

class Stuff {
    public void say(){
        System.out.println("Hello i am non static method");
    }
    public static void talbe() {

        for (int i=1;i<=10;i++){
            System.out.println(i*2);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {

        // non-static method reference
        Stuff ob = new Stuff();
        WorkInter workInter = ob::say;
        workInter.doTask();

        // static method reference
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Stuff.talbe();
            }
        };

        runnable.run();
        Thread th = new Thread(runnable);
        th.start();
    }
}