package ru.gb.HW.Less13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private static Semaphore tunnelQueue = new Semaphore(MainClass.CARS_COUNT);

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
            tunnelQueue.acquire();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            tunnelQueue.release();
            System.out.println(c.getName() + " закончил этап: " + description);
            if (MainClass.CARS_COUNT == 1) {
                System.out.println(c.getName() + "Win");
            }
        }
    }

}
