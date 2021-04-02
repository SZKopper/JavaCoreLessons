package ru.gb.HW.Less11.FruitApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Создадим параметризированный класс с наследованием от класса фрукты
public class Box<T extends Fruit> {
    //Создадим список который будет хранить разные фрукты
    private ArrayList<T> box;

    public Box() {
        box = new ArrayList<>();
    }
    //Создадим метод для добавления фруктов в коробку
    public void addFruit(T fruit){
        this.box.add(fruit);
    }
    //Создадим метод для подсчета веса коробки
    public float getWeight(){
        //Создадим переменную для хранения подсчитаного веса
        float weight = 0;
        //Проверяем не пустая ли коробка
        if (box.size() == 0){
            return 0;
        }
        //Проходим циклом по всем фруктам в коробке
        for (T fruit : box) {
            //Прибавляем в переменную веса вес каждого фрукта
            weight += fruit.getFruitWeight();
        }
        //Возвращаем общий вес
        return weight;
    }
    //Создадим метод для сравнения веса 2х коробок
    public boolean compare(Box box){
        //Возвращаем true если коробки равны по весу и false если вес отличается
        return this.getWeight() == box.getWeight();
    }
    //Создадим метод для пересыпания яблок из одной коробки в другую
    //На вход подается параметризованый список
    public void swapFruitInBox(Box<? super T> box){
        box.box.addAll(this.box);
    }
}

