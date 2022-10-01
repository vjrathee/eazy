package org.example;

public class TestCustomException {

    public void getOrder(int orderId) throws OrderNotFoundxception {

        if(orderId == 101){
            throw new OrderNotFoundxception("Order not found for id 101");
        }
    }


    public static void main(String[] args) throws OrderNotFoundxception {
        TestCustomException test = new TestCustomException();

        test.getOrder(101);

    }
}
