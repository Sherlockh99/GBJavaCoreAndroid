package lesson10;

import java.util.HashMap;
import java.util.Map;

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
        telephoneNumbers.addNumber("Попова",149521);
        telephoneNumbers.addNumber("Сидорова",44444);
        telephoneNumbers.addNumber("Попова",456789);
        telephoneNumbers.addNumber("Сидорова",55555);
        telephoneNumbers.addNumber("Попова",999999);
        telephoneNumbers.addNumber("Орлова",1111111);
        telephoneNumbers.getNumbers("Попова");
        telephoneNumbers.getNumbers("Сидорова");
        telephoneNumbers.getNumbers("Орлова");
    }
}
