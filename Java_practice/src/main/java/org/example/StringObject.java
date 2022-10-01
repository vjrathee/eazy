package org.example;

public class StringObject {


    public static void main(String[] args) {

        String s1 = new String("Vishawjyoti");
        // object 1 due to new keyword -. heap area
        // object 2 due to string literal in SCP -> String constant pool area
        String s2 = "Vishawjyoti";
        System.out.println(s1.intern());
        // intern method is used to get the reference  from SCP
        System.out.println(s1.intern().hashCode()== s2.hashCode());

        String s = "Vishaw";
        s.concat("Jyoti");
        System.out.println(" the concated string :::::   "+ s);
        // print only Vishaw as strings  are immutable

        StringBuilder sb= new StringBuilder();
        sb.append("java");
        sb.append("techie");
        System.out.println("New string build is ::::    "+sb);





    }


}