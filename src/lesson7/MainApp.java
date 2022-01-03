package lesson7;

public class MainApp {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Barsik");
        Plate plateBarsik = new Plate(7);
        catBarsik.eat(plateBarsik);
        catBarsik.eat(plateBarsik);

        System.out.println("----------------------");

        Cat[] cats = {
                new Cat("Barsuk"),
                new Cat("BlackCat"),
                new Cat("Antoshka"),
                new Cat("Murka"),
                new Cat("Kiska"),
                new Cat("Kotik"),
                new Cat("Cat")};

        Plate plateCats = new Plate(23);
        for (int i = 0; i <cats.length ; i++) {
            cats[i].eat(plateCats);
        }

        System.out.println("----------------------");
        Cat.Satiety(cats);
        System.out.println("----------------------");

        plateCats.addFood(23);
        for (int i = 0; i <cats.length ; i++) {
            if(!cats[i].isSatiety()){
                cats[i].eat(plateCats);
            }
        }

        System.out.println("----------------------");
        Cat.Satiety(cats);

    }
}
