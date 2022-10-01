package org.example;

public class GooglePay implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("transaction with 10% cashback");
    }
}
