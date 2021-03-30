package ru.gb.HW.Less10;

import java.util.*;
import java.util.List;

public class WordArr {
    private static int count;

    public static void main(String[] args) {
        // Создадим коллекцию слов
        List<String> list = Arrays.asList("Qwerty", "Qwert", "Qwer", "Qwe", "Qw", "Q", "Qwert", "Qwer", "Test", "Tes", "Te", "T", "Qwer", "Test", "Tes", "Q", "Q", "Q");
        //Создадим коллекцию для хранения уникальных слов
        List<String> unique = new ArrayList<>();

       /* //Создадим переменную iterator для перебора элементов коллекции
        Iterator<String> iterator = list.iterator();
        //Проходим циклом пока в коллекции есть элементы
        while (iterator.hasNext()){
            //Создадим переменную next для хранения возвращенного элемента коллекции
            String next = iterator.next();
            //Если в коллекции unique не содержится элемента next
            if (!unique.contains(next)){
                //Добавляем элемент в коллекцию unique
                unique.add(next);
            }
        }*/

        for (String s : list) {
            if (!unique.contains(s)){
                unique.add(s);
            }
        }

        //Вывод списка уникальных слов
        System.out.println("Уникальные слова из коллекции list " + unique + "\n");

        System.out.println("Подсчетколличества слов в коллекции list:");
        //Проходим по всем элементам коллекции unique
        for (String s : unique) {
            //Проходим по всем элементам коллекции list
            for (String s1 : list) {
                //Если элемент s эквивалентен s1
                if (s.equals(s1)){
                    //Прибавляем в счетчик +1
                    count++;
                }
            }
            //Выводим на экран сколько раз встречаются слова из коллекции unique
            System.out.println(s + " встречается " + count + " раз");
            //Сбрасываем счетчик
            count = 0;
        }
    }
}
