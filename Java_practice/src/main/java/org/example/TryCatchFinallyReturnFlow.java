package org.example;

public class TryCatchFinallyReturnFlow {

    public static int m1(){
        try{
            System.out.println(10/0);
            return 1;
        }catch (Exception ex){
            return 2;
        }
    finally {
        System.exit(0); // finally will not execute or  forcefully throw some exception from thr finally itself
//            return 3;

       }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }
}
