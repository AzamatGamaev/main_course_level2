package lesson5;

public class Main {
    static final int ARR_LENGHT = 10000000;

    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
    }

    static void method1() {
        long start = System.currentTimeMillis();
        float[] arr = new float[ARR_LENGHT];
        equateAllElementsTo1(arr);
        changeArr(arr);
        long finish = System.currentTimeMillis();
        printTime(start, finish);
    }

    static void method2() throws InterruptedException {
        long start2 = System.currentTimeMillis();
        float[] arr = new float[ARR_LENGHT];
        equateAllElementsTo1(arr);
        int half = ARR_LENGHT / 2;
        float[] arr1 = new float[half];
        float[] arr2 = new float[ARR_LENGHT - half];
        System.arraycopy(arr, 0, arr1, 0, half);
        System.arraycopy(arr, half, arr2, 0, ARR_LENGHT - half);
        Thread t1 = new Thread(() -> changeArr(arr1));
        Thread t2 = new Thread(() -> changeArr(arr2));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr, 0, arr, arr1.length, arr2.length);
        long finish2 = System.currentTimeMillis();
        printTime(start2, finish2);
    }

    public static void equateAllElementsTo1(float[] arr) {
        for (int i = 0; i < ARR_LENGHT; i++) {
            arr[i] = 1;
        }
    }

    public static void changeArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i / 2f));
        }   /*Тут было Warning: 'i / 5': integer division in floating-point context, ну добавил f*/
    }

    public static void printTime(long start, long finish) {
        System.out.println("Время выполнения второго метода = " + (finish - start) + "ms");
    }
}
