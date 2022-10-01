package org.example;

public class Child extends Parent{

    public void m1() {

        System.out.println("child m1 method ");
    }
    public static void m2(){
        System.out.println("static method of child");
    }
    public static void main(String[] args) throws Exception {
        Parent parent = new Child();
        parent.m1();

        Parent.m2();
        Child.m2();


    }
}
