package ru.gb.HW.Less8.Obstacles;

import ru.gb.HW.Less8.Participants.Actions;

//Имплементируем от Obstacles для возможности переиспользования общих методом в дальнейшего создания массива припятствий
public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public void enterWall(Actions actions){
        actions.jump();
    }

    @Override
    public void enterTreadmill(Actions actions) {
    }
}
