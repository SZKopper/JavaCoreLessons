package ru.gb.HW.Less7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catArr = {
                new Cat("Barsik", 2),
                new Cat("Murzik", 7),
                new Cat("Markiz", 5)
        }; // Саздаем массив котов и их аппетитов

        Plate plate = new Plate(1); // Создаем тарелку с кол-ом еды
        plate.addFood(50); // Добавляем еду в тарелку
        plate.info(); //Выводим инву о кол-ве еды в тарелке

        for (int i = 0; i < catArr.length; i++) { // Проходимся циклом по массиву котов
            catArr[i].eat(plate); //Заставляем каждого кото поесть из миски
            if (catArr[i].getSatiety()){ //Если кот поел и сытый
                System.out.println(catArr[i].getName() + " поел и сыт"); //Выводим на экран
            } else { //Если кот не поел и голодный
                System.out.println(catArr[i].getName() + " голодный"); //Выводим на экран
            }
        }
    }

}
