package ru.gb.HW.Less14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] a = {1 ,1, 1, 4, 4, 1, 4};

        ArrayEx1 ar = new ArrayEx1();
        ArrayEx2 ar2 = new ArrayEx2();

        ar.change(arr);
        System.out.println(ar2.check(a));
    }
}
