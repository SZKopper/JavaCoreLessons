package ru.gb.HW.Less7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; //Добавляем поле сытости для кота

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(Plate p) { // Метод заставляет кота кушать
        if (p.decreaseFood(appetite)) { //Если кот поел из тарелки
            satiety = true; // Меняем значение сытости
        }

    }


}
