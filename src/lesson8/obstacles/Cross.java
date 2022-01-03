package lesson8.obstacles;

import lesson8.runnables.Runnable;

public class Cross implements Obstacle{
    private double distance;

    public Cross(double distance){
        this.distance = distance;
    }

    @Override
    public boolean action(Runnable runnable) {
        return runnable.run(distance);
    }
}
