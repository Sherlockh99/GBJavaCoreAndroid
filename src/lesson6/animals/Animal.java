package lesson6.animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int limitation;
    protected static int count;

    public static int getCount() {
        return count;
    }

    public void run(int distance){
        if(distance>limitation){
            System.out.println(name + " не пробежит такую дистанцию. Ограничение: " + limitation + " метров.");
        }else {
            System.out.println(name + " пробежал " + distance + " метров.");
        }
    }


    public abstract void swim(int distance);
}
