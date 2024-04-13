package a1_collection.priority_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        // maxHeap.add(10); //=> duplicate are added.
        System.err.println(maxHeap);// [10]
        System.err.println(maxHeap.size());// 1
        // ------------------------------------
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        // --------------
        maxHeap.addAll(a);// add all the elemts of arraylist into the maxHeap.
        System.err.println(maxHeap);// [10,3,4,0,2,1]-> max on top but not in descending order.
        // ------------------------------------------
        ArrayList<Integer> al = new ArrayList<>(maxHeap);
        System.err.println(al);// display the arraylist.

    }
}
// Collections.reverseOrder() provides a comparator that reverses the natural
// ordering of elements, effectively turning the PriorityQueue into a max heap
// instead of the default min heap.
// ------------
