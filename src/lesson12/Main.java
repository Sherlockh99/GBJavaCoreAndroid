package lesson12;

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
