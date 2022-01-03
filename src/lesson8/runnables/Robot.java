package lesson8.runnables;

public class Robot implements Runnable{
    private String name;
    private double maxRun = 5500.0;
    private double maxJump = 0.5;

    public Robot(String name, double maxRun, double maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(double dist) {
        if(dist<=maxRun){
            System.out.printf("Робот %s смог пробежать %s м. \n",name,dist);
        }else{
            System.out.printf("Робот %s не смог пробежать %s м. \n",name,dist);
        }
        return dist<=maxRun;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=maxJump){
            System.out.printf("Робот %s смог перепрыгнуть %s м. \n",name,dist);
        }else{
            System.out.printf("Робот %s не смог перепрыгнуть %s м. \n",name,dist);
        }
        return dist<=maxJump;
    }
}
