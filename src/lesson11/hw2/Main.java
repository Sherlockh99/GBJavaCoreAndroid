package lesson11.hw2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать метод, который преобразует массив в ArrayList;
 */
public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        ArrayList<String> arrayList = arrayToArrayList(arrayOfStrings);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
        System.out.println();
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] arr){
        ArrayList<T> listOfStrings = new ArrayList<>(Arrays.asList(arr));
        return listOfStrings;
    }
}
