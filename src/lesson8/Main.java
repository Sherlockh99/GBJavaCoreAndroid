package lesson8;

import lesson8.obstacles.Cross;
import lesson8.obstacles.Obstacle;
import lesson8.obstacles.Wall;
import lesson8.runnables.Cat;
import lesson8.runnables.Man;
import lesson8.runnables.Robot;
import lesson8.runnables.Runnable;

/**
 * 1. Create three classes Man, Cat, Robot that do not inherit from the same class.
 * These classes must be able to run and jump.
 *
 * 2. Create two classes: a treadmill and a wall, when passing through which,
 * participants must perform the appropriate actions (run or jump),
 * the result of the execution is printed to the console (successfully ran, could not run, etc.).
 *
 * 3. Create two arrays: with participants and obstacles,
 * and have all participants go through this set of obstacles.
 *
 * 4. * Obstacles have a length (for a track) or a height (for a wall),
 * and participants have restrictions on running and jumping.
 * If the participant could not pass one of the obstacles,
 * then he does not go further along the list of obstacles.
 */
public class Main {
    public static void main(String[] args) {
        Runnable[] runJumpables = new Runnable[5];
        runJumpables[0] = new Cat("Murzilka");
        runJumpables[1] = new Man("Batman",10000,3.3);
        runJumpables[2] = new Man("Human");
        runJumpables[3] = new Robot("Transformer",12000,5.5);
        runJumpables[4] = new Robot("Mini robot",1000,0.3);

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
