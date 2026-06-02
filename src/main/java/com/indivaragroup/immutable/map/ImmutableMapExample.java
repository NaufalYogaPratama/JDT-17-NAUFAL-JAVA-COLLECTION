package com.indivaragroup.immutable.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        Map mapKosong = Collections.emptyMap();
        Map satuData = Collections.singletonMap("kay", "value");
//        Map mapModern = Map.of("k1, "v1", "k2", );

        Map existingMap = new HashMap<>();

        existingMap.put("nama", "Budi");
        existingMap.put("kota", "Jakarta");

        Map immutableDariExisting = Collections.unmodifiableMap(existingMap);

        System.out.println("mapKosong; " + mapKosong);
        System.out.println("satuData; " + satuData);
        System.out.println("mapModern; " + mapKosong);
        System.out.println("immutableDariExisting: " + immutableDariExisting);

        try {
            mapKosong.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("mapKosong tidak bisa diubah!" + e);
        }
        try {
            satuData.put("x", "y");
        } catch (UnsupportedOperationException e) {
            System.out.println("satuData tidak bisa diubah!" + e);
        }
    }
}
