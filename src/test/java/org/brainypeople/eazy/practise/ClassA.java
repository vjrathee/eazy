package org.brainypeople.eazy.practise;

import java.util.ArrayList;
import java.util.List;

public class ClassA {
    private final Integer Max_Lemgth;
    private final Integer MIN_LENGTH;


    public ClassA()
    {
        Max_Lemgth = 100;
        MIN_LENGTH = 10;

    }

    public int myint = 10;
    private static ClassA classA;

    public int getMyint() {
        return myint;
    }

    public void setMyint(int myint) {
        this.myint = myint;
    }

    public  ClassA display()
    {
        System.out.println(" Display method in class A");
           return this;
    }

    public void doubleDisplay()
    {
        System.out.println(" doubleDisplay method in class A");
        System.out.println(" doubleDisplay method in class A");
    }

    public static ClassA  getInstance()
    {
        classA = new ClassA();
        return classA;
    }
}
