package com.indivaragroup.sortedset;

import java.util.TreeSet;

public class TestComparatorSet {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Budi", 25));
        people.add(new Person("Arie", 22));
        people.add(new Person("Bahlil", 45));

        System.out.println(people);
    }
}
