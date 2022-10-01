package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
//@Override WRITTEN MANUALLY BY ME ONLY HASHCODE FOR EMPLOYEE ID
//    public int hashCode(){
//        return id;
//    }
//    public boolean equals(Object object){
//        Employee employee = (Employee) object;
//        return this.id == employee.getId() && this.name.equals(employee.getName());
//    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Basant");
        Employee employee2 = new Employee(101, "Basant");

        System.out.println("Is hashcode semae ::::    "+ (employee1.hashCode()==employee2.hashCode()));

        System.out.println("Is both objects same::::   "+ (employee1.equals(employee2)));

        Set<Employee> employees = new HashSet<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(null);

        System.out.println(employees);
    }
}
