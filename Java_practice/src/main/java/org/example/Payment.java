package org.example;


@FunctionalInterface
public interface Payment {

    public void doTransaction();

    default void addCoupon(){
        System.out.println("rs 5 as cashback");
            }
    static void generateReport(){
        System.out.println("Transaction report generated");

    }



}
