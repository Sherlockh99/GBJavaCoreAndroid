package lesson8.obstacles;

import lesson8.runnables.Runnable;

public class Wall implements Obstacle{
    private double height;

    public Wall(double height){
        this.height = height;
    }

    @Override
    public boolean action(Runnable runnable) {
        return runnable.jump(height);
    }
}
