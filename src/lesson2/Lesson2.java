package lesson2;

import java.util.Arrays;

/**
 1. Set an integer array consisting of elements 0 and 1. For example: [1, 1, 0, 1, 0, 1, 1, 0, 0].
 Using the cycle and the conditions replace 0 by 1, 1 by 0;

 2. Specify an empty integer array of size 8. Use a loop to fill it with the values 0 3 6 9 12 15 18 21;

  3. Set an array [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] to go through it in a cycle,
 and the numbers smaller 6 multiply by 2;

 4. Create a square two-dimensional integer array (the number of lines and columns is the same),
 and with the help of the cycle (s) fill its diagonal elements with units
 The elements of one of the diagonals can be determined by the following principle:
 the indices of such elements are equal, that is, [0] [0], [1] [1], [2] [2], ..., [n] [n];

 5. * Set one -dimensional array and find the minimum and maximum elements in it;

 6. ** Write a method into which the one -dimensional integer array is not empty,
 the method should return True if the massif has a place in which the sum of the left and right part of the array is equal.
 ** Examples:
 CheckBalance ([2, 2, 2, 1, 2, 2, 2, ||| 10, 1]) → True, i.e. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 CheckBalance ([1, 1, 1, ||| 2, 1]) → True, i.e. 1 + 1 + 1 = 2 + 1

 The border is shown by symbols |||, these symbols are not included in the array and have nothing to do with or.

 7. *** Write a method to which one -dimensional array and number n (may be positive or negative) are submitted
 to the input, while the method must shift all the elements of the array to the n positions.
 Elements are shifted cyclically. To complicate the task, it is impossible to use auxiliary arrays.
 Examples: [1, 2, 3] at n = 1 (per one to the right) -> [3, 1, 2]; [3, 5, 6, 1]
 with n = -2 (on two to the left) -> [6, 1, 3, 5]. At which n in which direction the shift can be chosen yourself.
 */
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


        int arr8[] = {2, 3, 4, 1, 8, 14, 5, 10, 13};
        arrayOffsetAlt(arr8,10);
        printArray(arr8);

        int arr9[] = {2, 3, 4, 1, 8, 14, 5, 10, 13};
        arrayOffsetAlt(arr9,-5);
        printArray(arr9);

        System.out.println();
        System.out.println("Задание 7; Альтернативное решение");
        //int arr8[] = {1, 2, 3, 4, 5};
        int[] someArr = {2, 3, 4, 1, 8, 14, 5, 10, 13};
        arrayOffsetAlt(someArr,18);
        printArray(someArr);

        int[] someArr2 = {2, 3, 4, 1, 8, 14, 5, 10, 13};
        arrayOffsetAlt(someArr2,-5);
        printArray(someArr2);

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

    public static void arrayOffsetAlt(int[] arr, int n){
        /*
        Андрей, проверил вашу вторую работу, по первым задачам у меня вопросов нет, они, как я считаю, относительно легкие.
        Конечно, основные трудности может вызвать задача 7. Вы ее решили и это замечательно.
        Я хочу вам показать, постараться расписать альтернативный способ решения данной задачи, как мне кажется, он является более лаконичным и оптимальным,
        возможно, вам будет интересно изучить его:

        основная идея следующая:
        Допустим, наш массив состоит из 9 элементов:

            int[] someArr = {2, 3, 4, 1, 8, 14, 5, 10, 13};

            И мы хотим сместить элементы на 2 или на 3, может на -4, а может и на 240, на -1450, тогда мы действительно можем убрать подобную проверку,
            пройтись в ОСНОВНОМ цикле 1450 раз и мы действительно получим валидный результат.

            При этом мы понимаем, что наша работа будет бесполезна, когда число, на которое мы производим смещение кратно самой размерности массива,
            мы просто впустую прогоняем циклы.
            Допустим, я предлагаю вам сместить элементы на 9, в таком случае, вы вообще ничего не должны делать,
            все ваши элементы, по итогу смещений, останутся на прежних местах.

            Далее, допустим я хочу произвести смещение на 10, следуем нашей формуле:

            10 % 9 = 1;
            9 + 1 = 10;
            10 % 9 = 1;
            Итого: Необходимо сместить элементы всего на 1,

            Допустим я хочу произвести смещение на - 10, вычисляем:

            -10 % 9 = -1
            9 - 1 = 8;
            8 % 9 = 8
            Итого: Необходимо произвести 8 итераций основноцикла, против 10 итераций (-10)

            Ну и частный случай, 0, тогда ответ - 0.

            static void shift(int[] arr, int n) {
                    int shift = (arr.length + n % arr.length) % arr.length; // Вычисляем реальное смещение
                    for (int i = 0; i < shift; i++) { // Выполним цикл смещения по одному элементу в соответствии с значенимем реального смещения (переменная shift)
                            int temp = arr[arr.length - 1]; // Сохраняем значение ПОСЛЕДНЕГО элемента массива
                            for (int j = arr.length - 1; j > 0 ; j--) { // Пройдем по всем элементам массива с конца в начало, заменим значение текущего элемента массива значением элемента, предшествующего текущему
                                    arr[j] = arr[j - 1];
                            }
                            arr[0] = temp; // А как быть с самым первым элементом? Вот как раз из переменной temp мы и получим недостающее значение
                    }
            }
                     */


        if(n==0){
            return;
        }
        int res = n % arr.length;
        if (res == 0){
            return;
        }
        res = arr.length + res;
        res = res % arr.length;

        int temp;
        for (int i = 0; i < Math.abs(res); i++) {
            if (n >= 0) {
                temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            } else {
                temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }
}
