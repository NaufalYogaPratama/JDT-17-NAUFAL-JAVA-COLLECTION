package com.indivaragroup.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue queue = new ArrayDeque<>();

        queue.offer("Pelanggan A");
        queue.offer("Pelanggan B");
        queue.offer("Pelanggan C");

        System.out.println("Antrian: " + queue);
        System.out.println("Paling depan: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Melayani: " + queue.poll());
        }
    }
}
