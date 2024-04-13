package a1_collection.set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class example1 {
    public static void main(String[] args) {
        HashSet<Integer> s = new LinkedHashSet<>();
        // ------------------------------------
        for (int i = 0; i < 5; i++) {
            s.add(new Random().nextInt(100) + 1);// generate random number between 0 to 99 and +1 shift to 1 to 100
        }
        System.out.println(s);// display the set
        System.out.println(s.size());// give the set size
        // ------------------------------------
        s.add(10);
        if (s.contains(10)) {
            s.remove(10);
            System.out.println("10 is removed from the set");
        }
    }
}
// ====HashSet VS LinkedHashSet====
// Collection(I) --> Set(I) --> HashSet(I) ---> LinkedHashSet(I)
// ------
// HashSet -> implemeted by HashTable, insertion order is not preserved.
// LinkedHashSet -> implemeted by LinkedList and HashTable, insertion order is
// preserved.
// -------------