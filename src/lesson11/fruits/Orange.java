package lesson11.fruits;

public class Orange extends Fruit{
    public Orange(int countFruits, double weight) {
        this.countFruits = countFruits;
        this.weight = weight;
    }

    public Orange(int countFruits) {
        this(countFruits,1.5);
    }
}
