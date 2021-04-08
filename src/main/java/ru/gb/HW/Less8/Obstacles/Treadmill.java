package ru.gb.HW.Less8.Obstacles;

import ru.gb.HW.Less8.Participants.Actions;

//Имплементируем от Obstacles для возможности переиспользования общих методом в дальнейшего создания массива припятствий
public class Treadmill implements Obstacles{
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public void enterWall(Actions cat) {
    }

    @Override
    public void enterTreadmill(Actions actions){
        actions.run();
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
