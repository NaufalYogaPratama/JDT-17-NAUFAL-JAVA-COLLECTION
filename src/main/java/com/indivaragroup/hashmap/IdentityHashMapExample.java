package com.indivaragroup.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        String key1 = new String("kunci");
        String key2 = new String("kunci");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "nilai 1");
        hashMap.put(key2, "nilai 2");

        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, "nilai1");
        identityHashMap.put(key2, "nilai2");

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("IdentityHashMap size: " + identityHashMap.size());
    }
}
