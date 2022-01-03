package lesson8;

import lesson8.obstacles.Cross;
import lesson8.obstacles.Obstacle;
import lesson8.obstacles.Wall;
import lesson8.runnables.Cat;
import lesson8.runnables.Man;
import lesson8.runnables.Robot;
import lesson8.runnables.Runnable;

public class Main {
    public static void main(String[] args) {
        Runnable[] runJumpables = new Runnable[5];
        runJumpables[0] = new Cat("Мурзилка");
        runJumpables[1] = new Man("Бетмен",10000,3.3);
        runJumpables[2] = new Man("Просто человек");
        runJumpables[3] = new Robot("Трансформер",12000,5.5);
        runJumpables[4] = new Robot("Миниробот",1000,0.3);

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = new Cross(89);
        obstacles[1] = new Wall(2.5);
        obstacles[2] = new Cross(900);
        obstacles[3] = new Cross(9000);

        for (int i = 0; i < runJumpables.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if(!obstacles[j].action(runJumpables[i])){
                    break;
                };
            }
        }
    }
}
