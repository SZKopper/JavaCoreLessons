package ru.gb.HW.Less13;

import java.util.concurrent.CountDownLatch;

public class MainClass {
    public static final int CARS_COUNT = 4;
    // Используем класс CountDownLatch для ожиданния выполнения других потоков. В качестве требуемых операций передается колличество авто CARS_COUNT
    // ridersReady используется для ожидания подготовки участников гонки
    static final CountDownLatch ridersReady = new CountDownLatch(CARS_COUNT);
    // raceEnd используется для ожидания прохождения всех препятствий
    static final CountDownLatch raceEnd = new CountDownLatch(CARS_COUNT);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        try {
            ridersReady.await(); // Вызываем метод await() для ожидания подготовки участников
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        try {
            raceEnd.await(); // Вызываем метод await() для ожидания финиширования всех участников
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}






