package lesson11;

import lesson11.fruits.Apple;
import lesson11.fruits.Box;
import lesson11.fruits.Fruit;
import lesson11.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println();


        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(20,2));
        fruits.add(new Orange(15));
        fruits.add(new Orange(25,2));

        ArrayList<Orange> arrOrange1 = new ArrayList<>();
        arrOrange1.add(new Orange(15));
        arrOrange1.add(new Orange(25,2));

        ArrayList<Orange> arrOrange2 = new ArrayList<>();
        arrOrange2.add(new Orange(20));
        arrOrange2.add(new Orange(10));

        ArrayList<Orange> arrOrange3 = new ArrayList<>();
        arrOrange3.add(new Orange(2,1.2));
        arrOrange3.add(new Orange(3,2));

        ArrayList<Apple> arrApple1 = new ArrayList<>();
        arrApple1.add(new Apple(20,2));
        arrApple1.add(new Apple(3));

        Box<Orange> boxOrange1 = new Box<Orange>(arrOrange1);
        Box<Orange> boxOrange2 = new Box<Orange>(arrOrange2);
        Box<Apple> boxApples1 = new Box<Apple>(arrApple1);
        Box<Apple> boxApples2 = new Box<Apple>(new Apple(7));

        System.out.println(boxOrange1.compare(boxApples1));
        System.out.println(boxOrange1.compare(boxApples2));
        System.out.println(boxOrange1.compare(boxOrange1));

        System.out.println(boxOrange1.getWeight());
        System.out.println(boxOrange2.getWeight());
        System.out.println(boxApples1.getWeight());



        boxOrange1.addFruit(boxOrange2);
        System.out.println(boxOrange1.getWeight());
        System.out.println(boxOrange2.getWeight());

        boxOrange2.addFruit(arrOrange3);
        boxOrange2.addFruit(new Orange(7));
        System.out.println(boxOrange2.getWeight());

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

