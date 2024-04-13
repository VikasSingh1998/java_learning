package a1_collection.priority_queue;

import java.util.PriorityQueue;
import java.util.Random;

//--------------------------------------
public class Example1 {
    // but this will make original PQ empty while printing,
    // So, we have to make copy PQ and then print.(remember cpp &pq and pq only).
    public static void displayPQ(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> pqc = new PriorityQueue<>(pq);// create PQ by copying the another PQ.
        while (!pqc.isEmpty()) {
            System.out.print(pqc.peek() + " ");
            pqc.poll();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();// create empty PQ, by default minHeap
        // PriorityQueue<Integer> maxHeap = new
        // PriorityQueue<>(Collections.reverseOrder());
        // ==> to create the maxHeap

        System.err.println(pq.size());// 0
        System.err.println(pq.add(2000));// true, add(value) to PQ and return t/f
        displayPQ(pq);// 2000
        System.err.println(pq.size());// 0

        for (int i = 0; i < 10; i++) {
            pq.offer(new Random().nextInt(50) + 10);// generate the random number from 11 to 20
            // new Random().nextInt(51) ==> generates a random number between 0 and 50
            // (inclusive).
            // Adding 10 to this result (new Random().nextInt(51) + 10) shifts the range to
            // be between 10 and 50 (inclusive).
        }
        System.out.println(pq);
        displayPQ(pq);
    }
}
// =========================================================================================
// PQ ==> is min heap, means minimum elemt on front --> default case. -->
// not all the elements will be sorted in ascending or descending, only min or
// max element will be on the front.
// When you insert elements into a PriorityQueue, it maintains the heap
// property, ensuring that the smallest element is always at the front.
// If you need a max-priority queue (where the largest element is at the front),
// you can achieve this by providing
// a custom comparator to the PriorityQueue constructor that reverses the
// natural ordering of elements.
// ------------------------------------------------------------------------------------------
// ==> pq.offer(value) ==> add the value to the PQ.

// ==> Object poll() ==> remove and return the front element of the PQ or Q(if
// not
// empty) if empty the return null.

// ==> Object peek() ==> To return head element of the Queue without removal, if
// Queue is empty this method returns null.

// pq.add(value) ==> add the value in the PQ.
