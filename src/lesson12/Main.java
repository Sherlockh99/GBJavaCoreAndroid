package lesson12;

/**
 * Многопоточность. Часть 1
 *
 * Необходимо написать два метода, которые делают следующее:
 * 1) Создают одномерный длинный массив, например:
 * static final int SIZE = 10 000 000;
 * static final int HALF = size / 2;
 * float[] arr = new float[size].
 * 2) Заполняют этот массив единицами.
 * 3) Засекают время выполнения: long a = System.currentTimeMillis().
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
 * Math.cos(0.4f + i / 2));
 * 5) Проверяется время окончания метода System.currentTimeMillis().
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
 *
 * Отличие первого метода от второго:
 * ● Первый просто бежит по массиву и вычисляет значения.
 * ● Второй разбивает массив на два массива,
 * в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 *
 * Пример деления одного массива на два:
 * ● System.arraycopy(arr, 0, a1, 0, h);
 * ● System.arraycopy(arr, h, a2, 0, h).
 * Пример обратной склейки:
 * ● System.arraycopy(a1, 0, arr, 0, h);
 * ● System.arraycopy(a2, 0, arr, h, h).
 * Примечание:
 * System.arraycopy() — копирует данные из одного массива в другой:
 * System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
 * Math.cos(0.4f + i / 2));
 * }
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки
 */

public class Main {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        timeToGo();
        timeToGoR();
    }

    public static void timeToGo(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void timeToGoR(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        float[] arr1 = new float[H];
        float[] arr2 = new float[H];

        System.arraycopy(arr,0,arr1,0,H);
        System.arraycopy(arr,H,arr2,0,H);

        TimeToGo timeToGo1 = new TimeToGo(arr1,0);
        TimeToGo timeToGo2 = new TimeToGo(arr2,H);

        timeToGo1.start();
        timeToGo2.start();


        try {
            timeToGo1.join();
            timeToGo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, H);
        System.arraycopy(arr2, 0, arr, H, H);

        System.out.println(System.currentTimeMillis() - start);

    }
}
