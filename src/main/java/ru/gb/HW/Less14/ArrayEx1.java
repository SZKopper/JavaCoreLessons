package ru.gb.HW.Less14;


public class ArrayEx1 {

    private int[] findArrSize(int [] a){
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 4){
                return new int[a.length - 1 - i];
            }
        }
        throw new RuntimeException("В массиве нет четверок");
    }

    public int[] change(int[] a){
        int[] finalArr = findArrSize(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i >= a.length - finalArr.length){
                int num = a[i];
                finalArr[count] = num;
                count++;
            }
        }
        return finalArr;
    }
}
