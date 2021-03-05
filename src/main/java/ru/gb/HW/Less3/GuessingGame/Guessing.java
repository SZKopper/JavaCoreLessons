package ru.gb.HW.Less3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guessing {
    //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    //При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int enter;
    public static void main(String[] args) throws IOException {
        int randomNum =  (int) (Math.random() * 9);
        int count = 3;
        comparison("Введите число от 0 до 9", count, randomNum);
        if (enter == randomNum){
            System.out.println("Вы выиграли");
        } else {
            System.out.println("Вы проиграли");
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        enter = Integer.parseInt(reader.readLine());
        if (enter > 1 || enter < 0){
            System.out.println("Введите 1 – если хотите повторить / 0 – если хотите закончить игру");
            enter = Integer.parseInt(reader.readLine());
        } else if (enter == 1) {
            comparison("Введите число от 0 до 9", count, randomNum);
        } else if (enter == 0){
            System.out.println("Игра окончена!");
        }
    }

    private static void comparison(String start, int count, int randomNum) throws IOException {
        System.out.println(start);
        do {
            enter = Integer.parseInt(reader.readLine());
            count--;
            if (enter == randomNum){
                System.out.println("Вы угадали!");
                break;
            } else if (enter > randomNum) {
                System.out.println("Введенное число больше загаданного!");
            } else if (enter < randomNum) { // Проверяем меньще ли введенное число чем загаданное
                System.out.println("Введенное число меньше загаданного!");
            }
        }while (count > 0) ;


    }
}
