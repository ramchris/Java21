package com.ram.home.java21.features.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


// Treeset won't allow null values but TreeSet will allow null values if we use Comparator.nullsFirst(Comparator.naturalOrder())
// or Comparator.nullsLast(Comparator.naturalOrder())
public class TreeSetTest {

    static void main() {
        Set<Integer> set = new TreeSet<>(Comparator.nullsLast(Comparator.naturalOrder()));
        set.add(1);
        set.add(null);
        set.add(2);
        System.out.println(set);

        set = new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));
        set.add(1);
        set.add(null);
        set.add(2);
        System.out.println(set);

    }

}
