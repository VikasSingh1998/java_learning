package a1_collection.set.HashSet;

import java.util.HashSet;
import java.util.Random;

public class example1 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
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
