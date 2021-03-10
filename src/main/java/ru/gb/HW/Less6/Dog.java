package ru.gb.HW.Less6;

//Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal{
    private String name;
    static int count = 0;



    public Dog(String name){
        count++;
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance > 500){
            System.out.println("Собачка не может бежать так далеко");
        } else {
            System.out.print(name);
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println("Собачка  не может так много проплыть");
        } else {
            System.out.print(name);
            super.run(distance);
        }
    }
}
