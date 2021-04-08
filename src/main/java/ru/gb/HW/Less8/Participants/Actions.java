package ru.gb.HW.Less8.Participants;

public interface Actions {
    void run();
    void jump();

    int getJumpLim();
    int getRunLim();
    String getName();
}
