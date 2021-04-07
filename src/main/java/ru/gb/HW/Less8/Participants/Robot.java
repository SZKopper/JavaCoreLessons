package ru.gb.HW.Less8.Participants;

public class Robot implements Actions{
    private String name;
    private int runLim;
    private int jumpLim;

    public Robot(String name, int runLim, int jumpLim) {
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
    public void run(int lenght) {
        if (runLim >= lenght){
            System.out.println("Робот " + name + " пробежал испытание");
        }
    }

    @Override
    public void jump(int height) {
        if (jumpLim >= height){
            System.out.println("Робот " + name + " перепрыгнул испытание");
        }
    }
}
