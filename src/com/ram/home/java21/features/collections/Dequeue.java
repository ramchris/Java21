package com.ram.home.java21.features.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("JDK 17");
        deque.addLast("JDK 21");

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.add("JDK 22");
        deque.add("JDK 25");
        deque.addFirst("JDK 14");
        deque.addFirst("JDK 11");
        deque.addFirst("JDK 8");
        deque.forEach(System.out::println);
    }
}
