package com.indivaragroup.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDequeExample {
    public static void main(String[] args) {
        Deque stack = new ArrayDeque<>();

        stack.push("Buku 1");
        stack.push("Buku 2");
        stack.push("Buku 3");

        System.out.println("Tumpukan: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Keluar: " + stack.pop());
        }
    }
}
