package com.sutar.innovation.collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("four");
        queue.add("five");

        System.out.println(queue.poll());   //removes element from the queue.
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());  //does not remove element from the queue
        System.out.println(queue);
    }
}
