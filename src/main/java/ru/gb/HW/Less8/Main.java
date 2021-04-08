package ru.gb.HW.Less8;

import ru.gb.HW.Less8.Obstacles.Obstacles;
import ru.gb.HW.Less8.Obstacles.Treadmill;
import ru.gb.HW.Less8.Obstacles.Wall;
import ru.gb.HW.Less8.Participants.Actions;
import ru.gb.HW.Less8.Participants.Cat;
import ru.gb.HW.Less8.Participants.Human;
import ru.gb.HW.Less8.Participants.Robot;

public class Main {
    public static void main(String[] args) {
        //Создаем массив участников
        Actions[] actions = {
                new Cat("Tim",2,2),
                new Cat("Tom",1,11),
                new Human("Jack", 1,7),
                new Robot("R1D2", 10, 10)
        };
        //Создаем массив препятствий
        Obstacles[] obstacles = {
                new Treadmill(2),
                new Wall(3)
        };

        //Прохим циклом каждый участник через каждое испытание
        for (Actions action : actions) {
            for (Obstacles obstacle : obstacles) {
                //Если размер прыжка >= высоте припятствия
                if (action.getJumpLim() >= obstacle.getHeight()){
                    //Участник может его перепрыгнуть
                    obstacle.enterWall(action);
                } else {
                    System.out.println(action.getName() + " не перепрыгнул испытание");
                    break;
                }
                //Если выносливость >= расстоянию дорожки
                if (action.getRunLim() >= obstacle.getLenght()){
                    //Участник может его пробежать
                    obstacle.enterTreadmill(action);
                } else {
                    System.out.println(action.getName() + " не пробежал испытание");
                    break;
                }
            }
        }
    }
}
