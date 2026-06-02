package com.indivaragroup.mutable.list;

import java.util.ArrayList;
import java.util.List;

public class ProblemMutableListTwo {
    public static List getData() {
        List data = new ArrayList();
        data.add("Apel");
        data.add("Mangga");
        data.add("Jeruk");
        return data;
    }

    public static void main(String[] args) {
        List data = getData();
        System.out.println("Data awal: " + data);

        data.add("Pisang");
        System.out.println("Setelah diubah: " + data);
    }
}
