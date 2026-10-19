package com.ram.home.java21.features.virtualthreads;

public  class Main {
static void main(String[] args) {

    Thread.startVirtualThread(() -> {
        System.out.println("Virtual Thread Running");
    });
}
}
