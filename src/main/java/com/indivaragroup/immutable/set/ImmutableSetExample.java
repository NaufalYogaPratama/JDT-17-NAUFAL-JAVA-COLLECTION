package com.indivaragroup.immutable.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetExample {
    public static void main(String[] args) {
        Set setKosong = Collections.emptySet();
        Set setSatu = Collections.singleton("Apel");
        Set setModern = Set.of("Apel", "Jeruk", "Mangga");

        Set existingSet = new LinkedHashSet<>();
        existingSet.add("Semangka");
        existingSet.add("Pisang");

        Set immutableSet = Collections.unmodifiableSet(existingSet);

        System.out.println("setKosong: " + setKosong);
        System.out.println("setSatu: " + setSatu);
        System.out.println("setModern: " + setModern);
        System.out.println("immutableSet: " + immutableSet);
    }
}
