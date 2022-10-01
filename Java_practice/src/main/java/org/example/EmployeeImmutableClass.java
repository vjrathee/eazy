package org.example;

import java.util.Date;
import java.util.List;

public final class EmployeeImmutableClass {

    private final String name; // primitive no modification will be there. immutable
    private final Date doj;//  for object like date make a clone of it
    private final List<String> mobile; // for Wrapper class return a new copy of it
    private final Address address;
    public EmployeeImmutableClass(String name, Date doj, List<String> mobile, Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {

        return (Date) doj.clone();
    }

    public List<String> getMobile() {

        return  mobile;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "EmployeeImmutableClass{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        Address address = new Address("delhi", 1211);
        EmployeeImmutableClass employee1 = new EmployeeImmutableClass("basant", date,
                List.of("1234","5678"), address);
        System.out.println("New Immutable employee is :::     "+ employee1);
        // employee1.name = "santosh";
        employee1.getDoj().setDate(15); // able to modify date object make a clone of it so  that not modifiable
        System.out.println(employee1);
//        employee1.getMobile().add("7896"); //trying to modify the mobile number
//        System.out.println(employee1);
        employee1.getAddress().setCity("pune");
        System.out.println(employee1);

      }
}
