package com.indivaragroup.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(1);
        pq.offer(8);
        pq.offer(3);
        pq.offer(9);
        pq.offer(2);

        System.out.println("PriorityQueue (urutan internal: " + pq);

        System.out.println("Keluar dari priority queue (terkecil dulu): ");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> pqTerbaik = new PriorityQueue<>(Collections.reverseOrder());

        pqTerbaik.add(5);
        pqTerbaik.add(1);
        pqTerbaik.add(8);
        pqTerbaik.add(3);
        pqTerbaik.add(9);
        pqTerbaik.add(2);

        System.out.println("PriorityQueue reverse (urutan internal): " + pqTerbaik);

        System.out.println("Keluar dari priority queue reverse (terbesar dulu): ");

        while (!pqTerbaik.isEmpty()) {
            System.out.println(pqTerbaik.poll() + " ");
        }
        System.out.println();
    }
}
