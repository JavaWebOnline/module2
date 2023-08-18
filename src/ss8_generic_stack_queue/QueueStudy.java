package ss8_generic_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
