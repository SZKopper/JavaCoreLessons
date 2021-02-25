package ru.gb.HW.Less2;

public class ArmsEquality {
    // Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        arrEmpty(arr);

    }

    public static boolean arrEmpty(int[] arr){
        int lSum = arr[0];
        int rSum = arr[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                lSum = lSum + arr[i];
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (rSum < lSum) {
                        rSum = rSum + arr[j- 1];
                    } else {
                        return true; // изменил оператор перехода break (для досрочного выхода из цикла) на return true
                    }
                }
                if (lSum == rSum){
                    return true; // изменил оператор перехода break (для досрочного выхода из цикла) на return true для
                }
            }
        System.out.println(lSum + " " + rSum);
        return lSum == rSum;
    }
}
