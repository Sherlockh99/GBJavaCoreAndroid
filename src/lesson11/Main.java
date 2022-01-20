package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] aa = {5,8,9,10};
        swapArray(aa,3,2);
        System.out.println(Arrays.toString(aa));

        String[] arrayOfStrings = {"1", "2", "3", "4"};
        ArrayList<String> arrayList = arrayToArrayList(arrayOfStrings);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+ " ");
        }
    }

    public static void swapArray(Object[] o, int index1, int index2){
        Object obj = o[index1];
        o[index1] = o[index2];
        o[index2] = obj;
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] arr){

        ArrayList<T> listOfStrings = new ArrayList<>(Arrays.asList(arr));

        /*
        ArrayList<T> listOfStrings1 = (ArrayList<T>) Arrays.asList(arr); - ошибка
        */

        /*
        ArrayList<T> listOfStrings = new ArrayList<T>();
        for (int i = 0; i < arr.length; i++) {
            listOfStrings.add(arr[i]);
        }
         */

        /*
        ArrayList<T> listOfStrings2 = new ArrayList<>();
        Collections.addAll(listOfStrings2, Arrays.asList(arr)); //error
        */

        return listOfStrings;
    }
}

