package com.indivaragroup.hashmap;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();

        String key1 = new String("user1");
        String key2 = new String("user2");
        String key3 = new String("user3");

        weakMap.put(key1, "Andi");
        weakMap.put(key2, "Budi");
        weakMap.put(key3, "Citra");

        System.out.println("Data awal: " + weakMap);

        key1 = null;
        key2 = null;

        System.gc();

        System.out.println("Data setelah GC: " + weakMap);
    }
}
