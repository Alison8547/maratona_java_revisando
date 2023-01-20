package br.com.maratonajava.collections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("A");
        queue.add("C");


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
