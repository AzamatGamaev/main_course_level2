package lesson3.Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] wordsList = {"A", "B", "C", "A", "D", "A", "Z", "X", "B"};
        Map<String, Integer> checker = new HashMap<>();
        for (String word : wordsList) {
            if (checker.containsKey(word)) {
                checker.put(word, checker.get(word) + 1);
            } else {
                checker.put(word, 1);
            }
        }
        System.out.println(Arrays.toString(wordsList));
        System.out.println(checker);
    }
}
