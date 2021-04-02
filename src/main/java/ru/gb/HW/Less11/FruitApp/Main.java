package ru.gb.HW.Less11.FruitApp;

public class Main {
    public static void main(String[] args) {
        //Создаем коробку для хранения яблок
        Box<Apple> appleBox = new Box<>();
        //Добавляем яблоки в коробку
        appleBox.addFruit(new Apple(1.1F));
        appleBox.addFruit(new Apple(1.5F));
        appleBox.addFruit(new Apple(1.5F));
        //Создаем коробку для хранения апельсинов
        Box<Orange> orangeBox = new Box<>();
        //Добавляем апельсины в коробку
        orangeBox.addFruit(new Orange(1.1F));
        orangeBox.addFruit(new Orange(1.5F));
        orangeBox.addFruit(new Orange(1.5F));
        //Создадим пустую коробку для пересыпания яблок
        Box<Apple> appleBox1 = new Box<>();
        //Добавляем в коробку appleBox1 яблоки из коробки appleBox
        appleBox1.swapFruitInBox(appleBox);
        //Добавление яблок в коробку с апельсинами вызовет ошибку
        //orangeBox.swapFruitInBox(appleBox);
        //Проверим равен ли вес коробки с яблоками коробке с апельсинами и выведем на экран
        System.out.println(appleBox.compare(orangeBox));
        //Посчитаем вес коробки и выведем результат на экран
        System.out.println(appleBox.getWeight());


    }
}
