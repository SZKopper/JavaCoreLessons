package ru.gb.HW.Less10;

import java.util.*;
import java.util.List;

public class WordArr {
    private static int count;

    public static void main(String[] args) {
        // Создадим коллекцию слов
        List<String> list = Arrays.asList("Qwerty", "Qwert", "Qwer", "Qwe", "Qw", "Q", "Qwert", "Qwer", "Test", "Tes", "Te", "T", "Qwer", "Test", "Tes", "Q", "Q", "Q");

        //Отфильтровываем унмкальные слова с помощью Set
        Set<String> t = new HashSet<String>(list);
        System.out.println("Уникальные слова в коллекции list: " + t);
        System.out.println("Подсчетколличества слов в коллекции list:");

        //Прохдим циклом по коллекции t
        for (String s : t) {
            //Выводим слова из коллекции t и с помощю метода frequency подсчитываем сколько раз слова из коллекции t встречаются в коллекции ist
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}
