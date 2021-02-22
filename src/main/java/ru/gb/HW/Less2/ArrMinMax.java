package ru.gb.HW.Less2;

public class ArrMinMax {
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
             a[i] = (int) (Math.random() * 21) ;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int min = a[0];
        int max = a[4];

        for (int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
            if(a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Min = " + min + " " + "Max = " + max);



    }
}
