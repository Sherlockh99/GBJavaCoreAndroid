package lesson13.stages;

import lesson13.Car;

public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }
    
    public abstract void go(Car c);
     
}
