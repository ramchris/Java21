package com.ram.home.java21.features.benchmark;

import java.util.HashMap;
import java.util.Map;

public class HashMapBenchmark {
    static void main(String[] args) {
        int count = 1_000_000;

        // 1. Default Capacity (starts at 16)
        long start1 = System.nanoTime();
        Map<Integer, Integer> map1 = new HashMap<>(count);
        for (int i = 0; i < count; i++) {
            map1.put(i, i);
        }
        long end1 = System.nanoTime();
        System.out.println(STR."Default Map: \{(end1 - start1) / 1_000_000} ms");

        // 2. Pre-calculated Capacity (count / 0.75 + 1)
        long start2 = System.nanoTime();
        Map<Integer, Integer> map2 = HashMap.newHashMap((int) (count / 0.75f) + 1);
        for (int i = 0; i < count; i++) {
            map2.put(i, i);
        }
        long end2 = System.nanoTime();
        System.out.println(count);
        System.out.println(STR."Pre-sized Map: \{(end2 - start2) / 1_000_000} ms");
    }
}