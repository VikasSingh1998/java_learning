package a1_collection.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

//---------------------------------------------------
class MyComparator implements Comparator<Character> {
    public int compare(Character c1, Character c2) {
        return c2 - c1;
    }
}

public class Example3 {
    public static void main(String[] args) {
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(new MyComparator());
        // generate some random char and add it to mxxHeap.
        for (int i = 0; i < 10; i++) {
            maxHeap.offer((char) (new Random().nextInt(26) + 'a'));
        }
        System.err.println(maxHeap);
    }
}
