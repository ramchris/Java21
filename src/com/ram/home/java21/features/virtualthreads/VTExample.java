package com.ram.home.java21.features.virtualthreads;

public class VTExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Thread.startVirtualThread(() -> System.out.println("Virtual thread running: " + finalI));
        }
    }
}
