package ru.gb.HW.Less1;

public class CheckingNumbers {
    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void main(String[] args) {
        comparison(6, 9);
    }

    public static boolean comparison(int a, int b) {
        int c = a + b;
        boolean result;

        if (c < 10 || c > 20) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
