package lesson10;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Create an array with a set of words (10-20 words, there should be duplicates).
 * Find and display a list of unique words that make up the array
 * (duplicates are not counted).
 * Count how many times each word occurs.
 *
 * 2. Write a simple PhoneBook class that stores a list of last names and phone numbers.
 * You can add entries to this phone book using the add() method.
 * Use the get() method to look up a phone number by last name.
 * It should be noted that there can be several phones under one surname (in the case of namesakes),
 * then when such a surname is requested, all phones should be displayed.
 */
public class Main {
    public static void main(String[] args) {
        words();
        telNumbers();
    }

    public static void words(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "orange", "lemon",
                "cherry", "garlic", "grape", "melon", "apple", "kiwi", "mango", "orange", "lemon", "olive", "lemon",
                "peanut", "apple", "pepper", "v", "apple", "potato"};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            Integer findWord = map.getOrDefault(words[i],0);
            map.put(words[i],findWord + 1);
        }
        System.out.println(map);
    }

    public static void telNumbers(){
        TelephoneNumbers telephoneNumbers = new TelephoneNumbers();
        telephoneNumbers.addNumber("Popova",149521);
        telephoneNumbers.addNumber("Sidorova",44444);
        telephoneNumbers.addNumber("Popova",456789);
        telephoneNumbers.addNumber("Sidorova",55555);
        telephoneNumbers.addNumber("Popova",999999);
        telephoneNumbers.addNumber("Orlova",1111111);
        telephoneNumbers.getNumbers("Popova");
        telephoneNumbers.getNumbers("Sidorova");
        telephoneNumbers.getNumbers("Orlova");
    }
}
