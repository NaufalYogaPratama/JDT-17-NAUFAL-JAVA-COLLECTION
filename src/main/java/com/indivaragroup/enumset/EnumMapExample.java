package com.indivaragroup.enumset;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Hari, String> jadwal = new EnumMap<>(Hari.class);

        jadwal.put(Hari.SENIN, "Meeting");
        jadwal.put(Hari.RABU, "Workshop");
        jadwal.put(Hari.JUMAT, "Review");

        for (Map.Entry<Hari, String> entry : jadwal.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Jadwal RABU: " + jadwal.get(Hari.RABU));

        System.out.println("Apakah ada jadwal di Hari KAMIS? " + jadwal.containsKey(Hari.KAMIS));
    }
}
