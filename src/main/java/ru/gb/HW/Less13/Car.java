package ru.gb.HW.Less13;

import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    // Используем класс CyclicBarrier для ожидания подготовки всех потоков к заезду
    private static CyclicBarrier cb;
    private static boolean winner = false;


    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            cb = new CyclicBarrier(CARS_COUNT); // Создадим объект класса CyclicBarrier для синхронизации готовности гонщиков
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            MainClass.ridersReady.countDown(); // Вызываем метод countDown() для уменьшения счетчика подготовки участников
            System.out.println(this.name + " готов");
            cb.await(); // Вызываем метод await() после готовности всех потоков для снимаем блокировки
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        MainClass.raceEnd.countDown(); // Вызываем метод countDown() для уменьшения счетчика финишировавших
        //Первый прошедший все испытания поток становится победителем
        if (!winner) {
            System.out.println(this.name + " - WIN");
            winner = true;
        }

    }
}
