package lesson6;

import lesson6.animals.Animal;
import lesson6.animals.Cat;
import lesson6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik",3);
        Animal dogDvornyaga = new Dog("Dvornyaga",5);
        Animal dogBobic = new Dog("Bobic",3);

        cat.swim(15);
        cat.run(250);
        cat.run(150);

        dogDvornyaga.swim(200);
        dogDvornyaga.swim(5);
        dogBobic.run(500);
        dogDvornyaga.run(700);
        Animal someAnimal = new Dog("Super Dvornyaga",9);
        System.out.println("Всего животных: " + Animal.getCount()+", в т.ч. котов: " + Cat.getCountCat() + ", собак: " + Dog.getCountDog());
    }
}