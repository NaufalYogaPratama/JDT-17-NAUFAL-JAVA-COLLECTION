package com.indivaragroup.mutable.list;

import java.util.ArrayList;
import java.util.List;

public class ProblemMutableList {


    public static void tampilkanData(List data) {
        data.add("Data tidak sengaja");
        System.out.println("Dia dalam method: " + data);
    }

    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("Budi");
        data.add("Siti");

        System.out.println("Sebelum method dipanggil: ");
        tampilkanData(data);
        System.out.println("Sesudah method dipanggil: ");
    }
}
