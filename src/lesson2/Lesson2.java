package lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        array01();

        System.out.println("Задание 2");
        array8();

        System.out.println("Задание 3");
        array1_2();

        System.out.println("Задание 4");
        int arr[][] = new int[5][5];
        diagonal(arr);

        System.out.println("Задание 5");
        minMax();

        System.out.println("Задание 6");
        int arr3[] = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkBalance(arr3);
        System.out.println(result);

        int arr4[] = {1, 1, 1, 2, 1};
        result = checkBalance(arr4);
        System.out.println(result);

        int arr5[] = {1, 1, 1, 8, 1};
        result = checkBalance(arr5);
        System.out.println(result);


        System.out.println("Задание 7");
        int arr6[] = {1, 2, 3, 4, 5};
        arrayOffset(arr6,3);
        printArray(arr6);

        int arr7[] = {1, 2, 3, 4, 5};
        arrayOffset(arr7,-3);
        printArray(arr7);

    }

    public static void array01(){
        int arr01[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        printArray(arr01);
    }

    public static void array8(){
        int arr[] = new int[8];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=n;
            n = n + 3;
        }
        printArray(arr);
    }

    public static void array1_2() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        printArray(arr);
    }

    public static void diagonal(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1]=1;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static void minMax(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println("Минимальное значение: " + temp[0] + "; Максимальное значение: " + temp[temp.length-1]);
        temp = null;
    }

    public static boolean checkBalance(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int sum_begin = arr[0];
        int sum_end = arr[arr.length-1];
        boolean result = false;
        while (true){
            if(sum_begin == sum_end && (i==j-1)){
                result = true;
                break;
            }

            if(sum_begin>sum_end){
                j = j - 1;
            }else{
                i = i + 1;
            }
            if(i>=j){
                break;
            }
            if(sum_begin>sum_end) {
                sum_end = sum_end + arr[j];
            }else {
                sum_begin = sum_begin + arr[i];
            }
        }

        return result;
    }

    public static void arrayOffset(int[] arr, int n){
        int temp;
        for (int i = 0; i < Math.abs(n); i++) {
            if(n>=0) {
                temp = arr[arr.length - 1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }else{
                temp = arr[0];
                for (int j = 0; j <arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }

            //System.out.println(arr);
        }
    }
}
