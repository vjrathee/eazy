package org.example;

public class PayTm implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("method implemented in PayTm");
    }

    public static void main(String[] args) {
        PayTm payTm = new PayTm();

        payTm.addCoupon(); // directly access the method of parent class. No logic is implemented in child class
        Payment.generateReport();
        payTm.doTransaction();
    }

}
