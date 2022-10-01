package threadsPractice;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        // static method increment is called
        System.out.println("the incremented value of i is    :"+ increment(2));

        MyThread thread1 = new MyThread();
        // Instantiate Runnable Class Thread
        Runnable myRunnableThread = new MyRunnableThread();
        Thread thread2 = new Thread(myRunnableThread);
        thread1.start();
       // thread1.join();
        thread2.start();
       //++ System.out.println(1/0); // this will raise arithmetic exception but
                                    // programme is execute as two independents threads are executing
    }

    public static int increment(int i){
        return ++i;
    }
}
