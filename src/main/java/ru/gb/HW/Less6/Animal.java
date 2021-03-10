package ru.gb.HW.Less6;

public class Animal {
    private String name;
    private int distance;
    static int count = 0;

    public Animal() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void run(int distance){
        System.out.println(" пробежал " + distance);

    }

    public void swim(int distance){
        System.out.println(" проплыл " + distance);
    }

}
