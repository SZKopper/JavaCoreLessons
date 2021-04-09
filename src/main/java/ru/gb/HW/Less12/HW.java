package ru.gb.HW.Less12;

import java.util.Arrays;

public class HW {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE/2;

    //Метод для пересчета элементов в массиве
    public void arrCalculate(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    //Первый метод выполняющий расчет без потоков
    public void method1(){
        float[] arr1 = new float[SIZE]; //Создали массив размером SIZE
        Arrays.fill(arr1, 1); //Заполнили его единицами
        long a = System.currentTimeMillis(); //Засекли время до пересчета массива
        arrCalculate(arr1); //Выполняем пересчет
        double b = ((double) System.currentTimeMillis() - a) / 1000; // Получаем время работы расчета
        System.out.println("Method1 work time: " + b + " sec"); //Выводи время работы первого метода
    }

    //Второй метод выполняющий расчет в потоках
    public void method2(){
        float[] arr2 = new float[SIZE]; //Создали массив размером SIZE

        Arrays.fill(arr2, 1); //Заполнили его единицами

        //Создаем два массива размером HALF
        float[] arr3 = new float[HALF];
        float[] arr4 = new float[HALF];

        long a = System.currentTimeMillis(); //Засекли время до деления массива и пересчета

        //Делим массив arr1 на два arr3 и arr4
        System.arraycopy(arr2,0,arr3,0,HALF);
        System.arraycopy(arr2,5,arr4,0,HALF);

        double finalA = (double) a / 1000; //Засекаем время до начала работы первого потока

        //Создаем первый поток
        Thread t1 = new Thread(() -> {
            System.out.println("First thread time before start: " + finalA + " sec");

            arrCalculate(arr3); //Выполняем пересчет для первой половины

            double b = (double) System.currentTimeMillis() / 1000; //Засекаем время кончания работы первого потока
            System.out.println("First thread end time: " + b + " sec");
        });

        double finalA1 = (double) a / 1000;//Засекаем время до начала работы второго потока

        //Создаем второй поток
        Thread t2 = new Thread(() -> {
            System.out.println("Second thread time before start: " + finalA1 + " sec");

            arrCalculate(arr4);//Выполняем пересчет для второй половины

            double b = (double) System.currentTimeMillis() / 1000;//Засекаем время кончания работы второго потока
            System.out.println("Second thread end time: " + b + " sec");
        });

        //Запускаем первый и второй потоки
        t1.start();
        t2.start();

        //Приостанавливаем время работы потока main пока потоки t1 и t2 не закончат работу
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = System.currentTimeMillis();

        //Собираем половинки массива в один
        System.arraycopy(arr3,0,arr2,0,HALF);
        System.arraycopy(arr4,0,arr2,HALF,HALF);

        //Расчитываем и выводим на экран время сборки в 1 массив
        System.out.println("Collection time in one array: " + (((double) System.currentTimeMillis() - a) / 1000) + " sec");

        //Расчитываем и выводим время работы второго метода
        double b = ((double) System.currentTimeMillis() - a) / 1000;
        System.out.println("Method2 work time: " + b + " sec");
    }
}
