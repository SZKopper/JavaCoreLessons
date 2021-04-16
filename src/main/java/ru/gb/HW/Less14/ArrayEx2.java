package ru.gb.HW.Less14;

public class ArrayEx2 {

    public boolean check(int[] a) {
        boolean one = false;
        boolean four = false;
        for (int i : a) {
            if (i != 1 && i != 4) {
                return false;
            }
            if (i == 1) {
                one = true;
            }
            if (i == 4) {
                four = true;
            }
        }
        return (one && four);
    }

}
