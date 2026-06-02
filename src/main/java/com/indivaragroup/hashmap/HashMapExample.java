package com.indivaragroup.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();

        nilaiMahasiswa.put("Budi", 85);
        nilaiMahasiswa.put("Siti", 92);
        nilaiMahasiswa.put("Andi", 78);

        System.out.println("Semua data mahasiswa: ");

        System.out.println(nilaiMahasiswa);

        System.out.println("Nilai siti: " + nilaiMahasiswa.get("Siti"));

        nilaiMahasiswa.put("Budi", 90);

        System.out.println("Apakah Andi ada? " + nilaiMahasiswa.containsKey("Andi"));

        nilaiMahasiswa.remove("Andi");

        System.out.println("Data setelah update dan hapus");
        for (Map.Entry<String, Integer> entry : nilaiMahasiswa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
