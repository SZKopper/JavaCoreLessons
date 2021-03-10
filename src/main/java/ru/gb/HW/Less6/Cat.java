package ru.gb.HW.Less6;

//Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal{
    private String name;
    static int count = 0;


    public Cat(String name){
        count++;
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance > 200){
            System.out.println("Котик не может бежать так далеко");
        } else {
            System.out.print(name);
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котик не умеет плавать");
    }
}
