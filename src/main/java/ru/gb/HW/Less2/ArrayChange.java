package ru.gb.HW.Less2;

public class ArrayChange {
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
