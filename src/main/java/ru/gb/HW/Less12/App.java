package ru.gb.HW.Less12;


public class App {
    public static void main(String[] args) {
        //Создаем объект класса HW
        HW hw = new HW();
        //Вызываем первый метод (без потоков)
        hw.method1();
        //Вызываем второй метод (с потоками)
        hw.method2();
    }
}
