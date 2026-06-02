package com.indivaragroup.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("Pisang", 3);
        hashMap.put("Apel", 1);
        hashMap.put("Jeruk", 2);
        hashMap.put("Mangga", 4);
        linkedHashMap.put("Pisang", 3);
        linkedHashMap.put("Apel", 1);
        linkedHashMap.put("Jeruk", 2);
        linkedHashMap.put("Mangga", 4);

        System.out.println("HashMap: ");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("LinkedHashMap: ");
        for (Map.Entry<String , Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
