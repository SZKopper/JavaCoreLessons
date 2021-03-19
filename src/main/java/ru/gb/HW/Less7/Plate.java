package ru.gb.HW.Less7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n){ // Если коту достаточно еды
            food -= n; // Вычитаем из еды в торелке аппетит кота чтобы узнать оставшееся кол-во еды
            return true; // Возвращаем, что кот поел
        } else {
            return false; // Возвращаем, что кот не поел тк недостаточно еды
        }
    }

    public void addFood(int inComeFood){ // Метод для добавления еды в тарелку
        food += inComeFood; // Добавляем к значению food введенное кол-во еды
    }

    public void info() { // Метод вывода инф-ии о еде в тарелке
        System.out.println("plate: " + food);
    }

}
