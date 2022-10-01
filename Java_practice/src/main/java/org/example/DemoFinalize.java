package org.example;

public class DemoFinalize {


    public static void main(String[] args) {

        DemoFinalize demo = new DemoFinalize();
        demo = null;
        System.gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalze executed");
    }
}
