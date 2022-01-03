package lesson8.runnables;

public class Cat implements Runnable {
    private String name;
    private final double MAX_JUMP = 3.0;
    private final double MAX_RUN = 100.0;


    public Cat(String name){
        this.name = name;
    }

    @Override
    public boolean run(double dist) {
        if(dist<=MAX_RUN){
            System.out.printf("Кот %s смог пробежать %s м. \n",name,dist);
        }else{
            System.out.printf("Кот %s не смог пробежать %s м. \n",name,dist);
        }
        return dist<=MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=MAX_JUMP){
            System.out.printf("Кот %s смог перепрыгнуть %s м. \n",name,dist);
        }else{
            System.out.printf("Кот %s не смог перепрыгнуть %s м. \n",name,dist);
        }
        return dist<=MAX_JUMP;
    }
}
