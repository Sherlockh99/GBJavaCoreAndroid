package lesson8.runnables;

public class Man implements Runnable {

    private String name;
    private double maxRun;
    private double maxJump;

    public Man(String name){
        this(name,3500,1.5);
    }

    public Man(String name, double maxRun, double maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(double dist) {
        if(dist<=maxRun){
            System.out.printf("Человек %s смог пробежать %s м. \n",name,dist);
        }else{
            System.out.printf("Человек %s не смог пробежать %s м. \n",name,dist);
        }
        return dist<=maxRun;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=maxJump){
            System.out.printf("Человек %s смог перепрыгнуть %s м. \n",name,dist);
        }else{
            System.out.printf("Человек %s не смог перепрыгнуть %s м. \n",name,dist);
        }
        return dist<=maxJump;
    }
}
