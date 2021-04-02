package ru.gb.HW.Less11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr{
    //Метод для смены элементов массива местами. На вход принимает массив и два индекса
    public void swapArrElem(String[] arr, int i, int j){
        //Сохраняем индекс i в переменню s
        String s = arr[i];
        //Присваиваем индексу i значение j
        arr[i] = arr[j];
        //Присваиваем индексу j значение индекса i
        arr[j] = s;
    }

}
