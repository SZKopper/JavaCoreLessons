package ru.gb.HW.Less11.FruitApp;
//Созлдадим абстрактный класс Фрукты
abstract class Fruit {
    //Создадим переменную для хранения веса фруктов
    protected float weight;

    //Создадим конструктор
    public Fruit(float weight) {
        this.weight = weight;
    }
    //Создадим геттер для получения веса фрукта
    public float getFruitWeight() {
        return weight;
    }
}
