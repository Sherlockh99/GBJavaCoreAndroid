package lesson11.hw1;

import java.util.Arrays;

/**
 * Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */
public class Main {
    public static void main(String[] args) {
        Integer[] aa = {5,8,9,10};
        swapArray(aa,3,2);
        System.out.println(Arrays.toString(aa));
    }

    public static void swapArray(Object[] o, int index1, int index2){
        Object obj = o[index1];
        o[index1] = o[index2];
        o[index2] = obj;
    }

}
