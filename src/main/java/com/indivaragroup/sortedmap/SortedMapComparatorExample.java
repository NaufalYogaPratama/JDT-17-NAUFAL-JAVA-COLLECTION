package com.indivaragroup.sortedmap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortedMapComparatorExample {
    public static void main(String[] args) {
        TreeMap nilaiMahasiswaZtoA = new TreeMap<>(Comparator.reverseOrder());

        nilaiMahasiswaZtoA.put("Citra", 88);
        nilaiMahasiswaZtoA.put("Andi", 75);
        nilaiMahasiswaZtoA.put("Budi", 92);
        nilaiMahasiswaZtoA.put("Dewi", 85);

        System.out.println("TreeMap urutan Z-A: " + nilaiMahasiswaZtoA);

        TreeMap<String, Integer> nilaiMahasiswaBerdasarkanPanjang = new TreeMap<>(Comparator.comparing(String::length));

        nilaiMahasiswaBerdasarkanPanjang.put("Citra", 88);
        nilaiMahasiswaBerdasarkanPanjang.put("Andi", 75);
        nilaiMahasiswaBerdasarkanPanjang.put("Budi", 92);
        nilaiMahasiswaBerdasarkanPanjang.put("Dewi", 85);
    }
}
