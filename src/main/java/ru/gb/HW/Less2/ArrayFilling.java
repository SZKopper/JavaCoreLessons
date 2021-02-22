package ru.gb.HW.Less2;

public class ArrayFilling {
    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void main(String[] args) {
        int[] a = new int[8];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
           a[i] = i + j;
           j = j + 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
