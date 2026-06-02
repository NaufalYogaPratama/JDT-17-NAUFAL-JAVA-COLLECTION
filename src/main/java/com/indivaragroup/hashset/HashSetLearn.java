package com.indivaragroup.hashset;

import java.util.HashSet;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> buah = new HashSet<>();

        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Pisang");
        buah.add("Apel");       //-> ignore duplicate

        System.out.println("Isi HashSet: " + buah);
        System.out.println("Mengandung Jeruk: " + buah.contains("Jeruk"));
        System.out.println("Jumlah data unik: " + buah.size());
    }
}
