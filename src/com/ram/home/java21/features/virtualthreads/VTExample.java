package com.ram.home.java21.features.virtualthreads;

public class VTExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Thread t = Thread.startVirtualThread(() -> System.out.println("VT "+ finalI +" is running..."));
            t.join();
        }
    }
}