package lesson11.fruits;

public class Apple extends Fruit{

    public Apple(int countFruits, double weight) {
        this.weight = weight;
        this.countFruits = countFruits;
    }

    public Apple(int countFruits) {
        this(countFruits,1);
    }

    /*
    public double getWeight(){
        return weight;
    }
     */
}
