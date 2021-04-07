package ru.gb.HW.Less8.Obstacles;

import ru.gb.HW.Less8.Participants.Actions;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    public void enterWall(Actions actions){
        actions.jump(height);
    }

    @Override
    public void enterTreadmill(Actions actions) {
    }
}
