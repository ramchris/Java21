package com.ram.home.java21.features.patterns;

record Student(String name, int marks) {}

public class StudentMain {
    static void main(String[] args) {

        Student s = new Student("Aman", 90);

        if (s instanceof Student(String name, _)) {
            System.out.println(name);
        }
        if (s instanceof Student(_, int marks)) {
            System.out.println(marks);
        }
    }
}
