package com.indivaragroup.linked.hashset;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>();

        String[] buah = {"Pisang", "Apel", "Jeruk", "Mangga"};

        for (String item : buah) {
            hashSet.add(item);
            linkedHashSet.add(item);
        }
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
