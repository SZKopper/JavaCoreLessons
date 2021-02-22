package ru.gb.HW.Less2;

public class SquareArray {
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void main(String[] args) {
        int[][] a = new int [5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 1;
                i++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
