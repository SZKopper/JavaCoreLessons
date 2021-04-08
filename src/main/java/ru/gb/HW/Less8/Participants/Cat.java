package ru.gb.HW.Less8.Participants;

//Имплементируем от Actions для возможности переиспользования общих методом в дальнейшего создания массива участников
public class Cat implements Actions{
    private String name;
    private int runLim;
    private int jumpLim;

    public Cat(String name, int runLim, int jumpLim) {
        this.name = name;
        this.runLim = runLim;
        this.jumpLim = jumpLim;
    }

    @Override
    public int getJumpLim() {
        return jumpLim;
    }

    @Override
    public int getRunLim() {
        return runLim;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " пробежал испытание");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " перепрыгнул испытание");
    }
}
