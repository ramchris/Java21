package com.ram.home.java21.features.patterns;

record Employee(String name, int age) {}

public class MainRecord {
    static void main(String[] args) {

        Employee emp = new Employee("Rahul", 25);

        if (emp instanceof Employee(String name, int age)) {
            System.out.println(name + " " + age);
        }
    }
}



