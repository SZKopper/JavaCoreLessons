package ru.gb.HW.Less8.Obstacles;

import ru.gb.HW.Less8.Participants.Actions;

public class Treadmill implements Obstacles{
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public void enterWall(Actions cat) {
    }

    public void enterTreadmill(Actions actions){
        actions.run(lenght);
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
