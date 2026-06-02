package com.indivaragroup.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> angka = new TreeSet<>();

        angka.add(2);
        angka.add(27);
        angka.add(91);
        angka.add(89);
        angka.add(1);
        angka.add(6);
        angka.add(21);
        angka.add(12);

        System.out.println("Data Terurut: " + angka);

        TreeSet<Integer> treeSet = (TreeSet<Integer>) angka;

        System.out.println("Nilai Terkecil: " + treeSet.first());
        System.out.println("Nilai Terbesar: " + treeSet.last());
        System.out.println("headSet(5): " + treeSet.headSet(5));
        System.out.println("tailSet(5): " + treeSet.tailSet(5));
        System.out.println("subSet(3,8): " + treeSet.subSet(3,8));

    }
}
