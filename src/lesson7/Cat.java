package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            satiety = true;
            System.out.println(name + " поел из тарелки");
        }else{
            System.out.println(name + " не хватает еды в тарелке");
        };
    }

    public static void Satiety(Cat[] cats){
        for (int i = 0; i <cats.length ; i++) {
            if(cats[i].isSatiety()){
                System.out.println(cats[i].getName() + " сыт");
            }else {
                System.out.println(cats[i].getName() + " голоден");
            }
        }
    }

    public String getName() {
        return name;
    }

}
