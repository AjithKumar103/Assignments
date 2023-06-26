package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        // Queue Implementation
        System.out.println("========= Queue Implementation ==========");
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enqueue:");
        queue.add(77);
        queue.add(55);
        queue.add(22);
        System.out.println(queue);
        System.out.println("Dequeue: " + queue.poll());
        System.out.println("Show the front element: " + queue.element());
        System.out.println("Front element " + queue.peek());

        // Priority Queue
        // it sort the elements by priority like smallest to largest
        System.out.println("========= Priority Queue Implementation ==========");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(77);
        priorityQueue.add(55);
        priorityQueue.add(22);
        System.out.println(priorityQueue);
        System.out.println("Front element " + priorityQueue.peek());
        System.out.println("Dequeue: " + priorityQueue.poll());
     }
}
