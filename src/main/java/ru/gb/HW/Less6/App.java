package ru.gb.HW.Less6;

public class App {
    public static void main(String[] args) {
        Cat c1 = new Cat("Мурзик");
        Cat c2 = new Cat("Вульф");
        Cat c3 = new Cat("Марс");
        Dog d1 = new Dog("Бобик");
        Dog d2 = new Dog("Дружок");
        Animal a2 = new Animal();

        c1.run(100);
        c2.run(220);
        c3.swim(5);
        d1.swim(1);
        d2.run(459);
        d2.swim(15);

        System.out.println("Всего животных " + Animal.count);
        System.out.println("Всего кошечек " + Cat.count);
        System.out.println("Всего собачек " + Dog.count);

    }
}
