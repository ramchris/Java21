package com.ram.home.java21.features.strtemplates;

public class StringTemplates {
    public static void main(String[] args) {
        String name = "Ram";

        final String reminder = "Don't forget to follow Java 21 features";
        final String welcomeMessage = "Welcome, %s. %s".formatted(name, reminder);

        System.out.println(welcomeMessage);
    }
}