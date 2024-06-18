package TaskL13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook pb= new PhoneBook();


        String[] words = {
                "Корова",
                "Теленок",
                "Курица",
                "Утка",
                "Тигр",
                "Баран",
                "Лев",
                "Собака",
                "Кот",
                "Кошка",
                "Кабан",
                "Собака",
                "Кот"
        };
        System.out.println("Список и количество слов:");
        countUnique(words);
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + ".");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}




