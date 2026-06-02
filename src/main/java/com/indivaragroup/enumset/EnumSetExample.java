package com.indivaragroup.enumset;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Hari> workDay = EnumSet
                .of(Hari.SENIN, Hari.SELASA, Hari.RABU, Hari.KAMIS, Hari.JUMAT);

        EnumSet<Hari> weekend = EnumSet.of(Hari.SABTU, Hari.MINGGU);
        EnumSet<Hari> allDay = EnumSet.allOf(Hari.class);

        System.out.println("Hari Kerja" + workDay);
        System.out.println("Hari Libur" + weekend);
        System.out.println("Semua Hari" + allDay);
    }
}
