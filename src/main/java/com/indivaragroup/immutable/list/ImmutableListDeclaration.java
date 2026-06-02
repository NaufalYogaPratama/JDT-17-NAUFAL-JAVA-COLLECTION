package com.indivaragroup.immutable.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDeclaration {
    public static void main(String[] args) {
        List list1 = Collections.emptyList();

        List  list2 = Collections.singletonList("Apel");

        List  list3 = List.of("Apel", "Mangga", "Jeruk");

        List existingList = new ArrayList();
        existingList.add("Pisang");
        existingList.add("Semangka");

        List list4 = Collections.unmodifiableList(existingList);

        System.out.println(list1);
        System.out.println(list2    );
        System.out.println(list3);
        System.out.println(list4);
    }
}
