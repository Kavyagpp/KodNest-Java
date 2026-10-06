
import java.util.*;

public class Pgm1 {

    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();
        freq.put('a', 1);
        freq.put('b', 1);
        freq.put('c', 1);
        freq.put('5', 5);

        System.out.println(freq);

        freq.put('a', freq.getOrDefault('a', 0) + 1);
        System.out.println(freq);
        freq.put('d', freq.getOrDefault('d', 2));
        System.out.println(freq);

        freq.put('5', freq.getOrDefault('5', 0));
        System.out.println(freq);
    }
}
