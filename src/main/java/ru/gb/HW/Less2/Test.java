package ru.gb.HW.Less2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =  1; // переменая свдвига
        int[] arr = {1, 2, 3}; // массив
        arrShift(arr, a);
    }

    public static void arrShift(int[] arr, int a){



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
