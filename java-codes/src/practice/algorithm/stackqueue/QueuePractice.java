package practice.algorithm.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("h");
        queue.offer("e");
        queue.offer("l");
        queue.add("l");
        queue.add("o");
        System.out.println("queue = " + queue);

        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);

        queue.clear();
        System.out.println("queue = " + queue);
        System.out.println("queue.isEmpty() = " + queue.isEmpty());

        /**
         * queue = [h, e, l, l, o]
         * queue.isEmpty() = false
         * queue.poll() = h
         * queue.remove() = e
         * queue.peek() = l
         * queue = [l, l, o]
         * queue = []
         * queue.isEmpty() = true
         * */
    }
}
