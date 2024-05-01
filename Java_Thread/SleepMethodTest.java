package Java_Thread;

public class SleepMethodTest extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            // thread will sleep for the 500 melli seconds
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SleepMethodTest th1=new SleepMethodTest();
        SleepMethodTest th2=new SleepMethodTest();

        th1.start();
        th2.start();
    }
}
