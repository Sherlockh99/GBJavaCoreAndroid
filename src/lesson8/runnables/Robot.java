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
            System.out.printf("The robot %s was able to run %s m. \n",name,dist);
        }else{
            System.out.printf("The robot %s could not run %s m. \n",name,dist);
        }
        return dist<=maxRun;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=maxJump){
            System.out.printf("The robot %s was able to jump %s m. \n",name,dist);
        }else{
            System.out.printf("The robot %s could not jump %s m. \n",name,dist);
        }
        return dist<=maxJump;
    }
}
