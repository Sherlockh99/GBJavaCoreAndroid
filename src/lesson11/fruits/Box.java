package lesson11.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T> {

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    public Box(T fruit){
        fruits = new ArrayList<>();
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            weight+=((Fruit) fruits.get(i)).getWeight()*((Fruit) fruits.get(i)).getCountFruits();
        }
        return weight;
    }

    public boolean compare(Box box){
        return getWeight() == box.getWeight();
    }

    public void addFruit(Box<T> fromBox){
        addFruit(fromBox.fruits);
        fromBox.fruits.clear();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public void addFruit(ArrayList<T> fruits){
        this.fruits.addAll(fruits);
    }
}
