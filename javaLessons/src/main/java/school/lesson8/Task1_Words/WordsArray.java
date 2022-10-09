package school.lesson8.Task1_Words;

import java.util.*;

public class WordsArray {
    public static void getUniqueWords(String[] wordArray) {
        Set<String> unique = new HashSet<>();
        for (String word : wordArray) {
            unique.add(word.toLowerCase(Locale.ROOT));
        }
        for (String word : unique) {
            System.out.println(word);
        }
    }

    public static void countWords(String[] wordArray) {
        Map<String, Integer> words = new HashMap<>();
        for (String word : wordArray) {
            words.put(word.toLowerCase(Locale.ROOT), words.get(word.toLowerCase(Locale.ROOT)) == null ? 1 :
                    (words.get(word.toLowerCase(Locale.ROOT)) + 1));
        }
        System.out.println(words);
    }
}
