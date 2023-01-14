package lesson9;

import java.util.Arrays;

/**
 1. Write a method that takes a two-dimensional string array of 4x4 size as input;
 when an array of a different size is supplied,
 you must throw a MyArraySizeException exception.

 2. Next, the method must go through all the elements of the array,
 convert to int, and sum up. If the conversion fails in some element of the array,
 an exception MyArrayDataException should be thrown, detailing which particular cell
 contains incorrect data.

 3. In the main() method, call the received method, handle possible exceptions
 MySizeArrayException and MyArrayDataException, and display the result of the calculation.
 */
public class Main {
    public static void main(String[] args) {
        String[][] arrString = new String[4][4];
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length; j++) {
                arrString[i][j] = Integer.toString(i+j);
            }
        }

        arrString[1][2] = "ddd";
        printArray(arrString);
        try {
            int sum = Array4x4(arrString);
            System.out.println(sum);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
        System.out.println("END");
    }

    public static int Array4x4(String[][] arrays) throws MyArraySizeException, MyArrayDataException {
        if(arrays.length>4){
            throw new MyArraySizeException("Invalid array size");
        }

        for (int i = 0; i <arrays.length; i++) {
            if(arrays[i].length>4){
                throw new MyArraySizeException("Invalid array size");
            }
        }

        int sum = 0;
        for (int i = 0; i <arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                try{
                    sum = sum + Integer.parseInt(arrays[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Invalid cell number [" + (i+1)+"]["+(j+1)+"]");
                }
            }
        }
        return sum;
    }

    public static void printArray(String[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }
}
