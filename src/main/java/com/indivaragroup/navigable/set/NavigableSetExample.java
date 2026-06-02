package com.indivaragroup.navigable.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(13);

        System.out.println("Isi NavigableSet: " + set);
        System.out.println("lower(6): " + set.lower(6) + " lebih kecil dari 6");
        System.out.println("floor(6): " + set.floor(6) + " lebih kecil atau sama dengan 6");
        System.out.println("higher(6): " + set.higher(6) + " lebih besar dari 6");
        System.out.println("ceiling(6): " + set.ceiling(6) + " lebih besar atau sama dengan 6");
        System.out.println("ceiling(): " + set.ceiling(5) + " sama dengan 5");
        System.out.println("Urutan dibalik: " + set.descendingSet());
    }
}
