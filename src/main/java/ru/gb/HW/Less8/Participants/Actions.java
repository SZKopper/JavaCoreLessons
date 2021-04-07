package ru.gb.HW.Less8.Participants;

public interface Actions {
    void run(int lenght);
    void jump(int height);

    int getJumpLim();
    int getRunLim();
    String getName();
}
