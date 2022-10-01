package org.example;

public class ThreadMainClass {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("MAINTHREAD");
        System.out.println("the main thread is there for running   :::   "+ Thread.currentThread().getName());
        Thread.currentThread().setPriority(5);
        System.out.println("the priority of main thread is :::     "+ Thread.currentThread().getPriority());
        System.out.println("the total active threads are :::   "+ Thread.activeCount());
        System.out.println("is the main is current thread alive   ::::    " + Thread.currentThread().isAlive());

        for(int i= 5;i>=0;i--){
            System.out.println("the value of i is   ::::  "+ i);
            Thread.sleep(2000); // which thread is running for loop
        }

    // creating the object of thread class MyRunnableThread

      MyRunnableThread myThread = new MyRunnableThread();
      Thread thread2 = new Thread(myThread);
      thread2.start();
     //   thread2.run();
      thread2.setName("SecondThread");
      System.out.println("the second thread is  :::    "+ thread2.getName());
      System.out.println("the priority of second thread is ::::    "+ thread2.getPriority());
      System.out.println("is the Second thread  is current thread alive   ::::    " + thread2.isAlive());
        // thread2.setDaemon(true);
    }
}
