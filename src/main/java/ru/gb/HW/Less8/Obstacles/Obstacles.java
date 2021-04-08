package ru.gb.HW.Less8.Obstacles;

import ru.gb.HW.Less8.Participants.Actions;

public interface Obstacles {
    void enterWall(Actions cat);
     void enterTreadmill(Actions actions);

    int getHeight();
    int getLenght();
}
