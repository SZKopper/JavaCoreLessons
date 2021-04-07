package ru.gb.HW.Less12;

import java.util.Arrays;

public class HW {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE/2;

    public void arrCalculate(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public void method1(){
        float[] arr1 = new float[SIZE];
        Arrays.fill(arr1, 1);
        long a = System.currentTimeMillis();
        //System.out.println(a/ 1000);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        //System.out.println(System.currentTimeMillis()/ 1000);
        double b = ((double) System.currentTimeMillis() - a) / 1000;
        System.out.println("Method1 work time: " + b + " sec");
    }


    public void method2(){
        float[] arr2 = new float[SIZE];
        Arrays.fill(arr2, 1);
        float[] arr3 = new float[HALF];
        float[] arr4 = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arr2,0,arr3,0,HALF);
        System.arraycopy(arr2,5,arr4,0,HALF);

        double finalA = (double) a / 1000;
        Thread t1 = new Thread(() -> {
            System.out.println("First thread time before start: " + finalA + " sec");
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = (float)(arr3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            double b = (double) System.currentTimeMillis() / 1000;
            System.out.println("First thread end time: " + b + " sec");
        });

        double finalA1 = (double) a / 1000;
        Thread t2 = new Thread(() -> {
            System.out.println("Second thread time before start: " + finalA1 + " sec");
            for (int i = 0; i < arr4.length; i++) {
                arr4[i] = (float)(arr4[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            double b = (double) System.currentTimeMillis() / 1000;
            System.out.println("Second thread end time: " + b + " sec");
        });

        t1.start();
        t2.start();

        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = System.currentTimeMillis();
        System.arraycopy(arr3,0,arr2,0,HALF);
        System.arraycopy(arr4,0,arr2,HALF,HALF);
        System.out.println("Collection time in one array: " + (((double) System.currentTimeMillis() - a) / 1000) + " sec");

        double b = ((double) System.currentTimeMillis() - a) / 1000;
        System.out.println("Method2 work time: " + b + " sec");
    }
}
