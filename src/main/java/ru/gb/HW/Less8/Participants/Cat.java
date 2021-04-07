package ru.gb.HW.Less8.Participants;

public class Cat implements Actions{
    private String name;
    private int runLim;
    private int jumpLim;

    public Cat(String name, int runLim, int jumpLim) {
        this.name = name;
        this.runLim = runLim;
        this.jumpLim = jumpLim;
    }

    public int getJumpLim() {
        return jumpLim;
    }

    public int getRunLim() {
        return runLim;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int lenght) {
        if (runLim >= lenght){
            System.out.println("Кот " + name + " пробежал испытание");
        }
    }
    @Override
    public void jump(int height) {
        if (jumpLim >= height){
            System.out.println("Кот " + name + " перепрыгнул испытание");
        }
    }
}
