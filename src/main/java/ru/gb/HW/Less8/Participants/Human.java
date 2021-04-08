package ru.gb.HW.Less8.Participants;

public class Human implements Actions{
    private String name;
    private int runLim;
    private int jumpLim;

    public Human(String name, int runLim, int jumpLim) {
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
        System.out.println("Атлет " + name + " пробежал испытание");
    }
    @Override
    public void jump() {
        System.out.println("Атлет " + name + " перепрыгнул испытание");
    }
}
