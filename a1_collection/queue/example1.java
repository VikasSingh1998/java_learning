package a1_collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class example1 {
    public static void displayQueue(Queue<Integer> q) {
        Queue<Integer> q1 = new ArrayDeque<>(q);
        while (!q1.isEmpty()) {
            System.out.print(q1.peek() + " ");
            q1.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.offer(i + 1);
        }
        displayQueue(q);
        if (q.contains(3)) {
            System.out.println("3 is present in the Queue.");
        }
        System.out.println("Q size is: " + q.size());
        q.clear();
        System.out.println("After clear Q size is: " + q.size());
    }
}
// Here Queue can be implemented in 2 ways.==> LinkedList and ArrayDeque
/// ---
