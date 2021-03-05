package ru.gb.HW.Less3.GuessingGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guessing {
    //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    //При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int counter = 1;


    public static void main(String[] args) throws IOException {
        System.out.println("Введите число от 0 до 9");
        int enter = Integer.parseInt(reader.readLine()); // Переменная хранящая пользовательский ввод
        comparison(enter);// Метод принимающий пользовательский ввод
        if (counter == 3){
            System.out.println("Вы проиграли.\nПовторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет");
            enter = Integer.parseInt(reader.readLine());
            if (enter > 1 || enter < 0){
                System.out.println("Введите 1 – если хотите повторить / 0 – если хотите закончить игру");
            } else if (enter == 1) {
                System.out.println("Введите число от 0 до 9");
                enter = Integer.parseInt(reader.readLine());
                comparison(enter);
            } else if (enter == 0){
                System.out.println("Игра окончена!");
            }
        }

    }

    private static void comparison(int enter) throws IOException {
        int randomNum =  (int) (Math.random() * 9); // Переменна хранит рандомное число от 0 до 9

        // Цикл выполняется пока counter < 3
        do {
            counter++;
            if (enter > randomNum){ // Проверяем больше ли введенное число чем загаданное
                System.out.println("Введенное число больше загаданного!\nПовторите попытку"); // Если больше выводим текст вывдим этот текст и выходим из цикла
            } else if (enter < randomNum){ // Проверяем меньще ли введенное число чем загаданное
                System.out.println("Введенное число меньше загаданного!\nПовторите попытку"); // Если меньше выводим текст вывдим этот текст и выходим из цикла
            } else {// Проверяем равно ли введенное число загаданному
                System.out.println("Вы угадали!\nПовторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)"); // Если загаданное и введенное равны вывдим этот текст
                enter = Integer.parseInt(reader.readLine());
                if (enter > 1 || enter < 0){
                    System.out.println("Введите 1 – если хотите повторить / 0 – если хотите закончить игру");
                } else if (enter == 1) {
                    System.out.println("Введите число от 0 до 9");
                    enter = Integer.parseInt(reader.readLine());
                    comparison(enter);
                } else if (enter == 0){
                    System.out.println("Игра окончена!");
                }
            }

            enter = Integer.parseInt(reader.readLine());
        } while ( counter < 3);


    }

}
