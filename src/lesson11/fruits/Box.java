package lesson11.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T> {

    Fruit fruit;
    int countFruits;

    public Box(Fruit fruit, int countFruits) {
        this.fruit = fruit;
        this.countFruits = countFruits;
    }

    public double getWeight() {
        return fruit.getWeight()*countFruits;
    }

    public boolean compare(Box box){
        return fruit.getWeight()*countFruits == box.getWeight();
    }

    public <T> void intersperse(Box<T> toBox){
        toBox.addCountFruits(countFruits);
        countFruits = 0;
    }

    public void addCountFruits(int countFruits) {
        this.countFruits = this.countFruits + countFruits;
    }
}
