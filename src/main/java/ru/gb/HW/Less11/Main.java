package ru.gb.HW.Less11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создаем объект класса Arr
        Arr arr = new Arr();
        //Создаем массив
        String[] array = {"T","N","Y"};
        //Вызываем метод swapArrElem для объекта arr в котором передаем массив и индексы элементов которые хотим поменять
        arr.swapArrElem(array, 2, 0);
        //Выводим результат
        System.out.println(Arrays.toString(array));
        //Преобразуем массив array в коллекцию ArrayList с помощью метода asList класса Arrays
        Arrays.asList(array);
    }
}
