package lesson11.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<Fruit> {

    Fruit fruit;
    //TId id;
    //int weight;
    int countFruits;

    public Box(Fruit fruit, int countFruits) {
        this.fruit = fruit;
        this.countFruits = countFruits;
    }

    //private ArrayList<Fruit> fruits = new ArrayList<>();

    public int getWeight() {
        //return countFruits * fruit.getWidht();
        return 0;
    }
}
