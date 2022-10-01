package threadsPractice;

public class MyThread extends Thread{
    @Override
    public void run() {

        for(int i=0;i<=10;i++){

            System.out.println("thread #1 is printing   :"+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread 1 finished its execution");
     }
}
