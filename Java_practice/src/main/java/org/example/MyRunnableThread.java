package org.example;

public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
       // because implements runnable if(this.isDaemon)
        System.out.println("this is user thread is running");
    }
}
