package threadsPractice;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
       int i= MainClass.increment(2);
        for(i=10;i>=0;i--){
            System.out.println("thread #2 is Printing    :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread 2 finished it execution");
    }
}
