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
            System.out.printf("The man %s was able to run %s m. \n",name,dist);
        }else{
            System.out.printf("The man %s could not run %s m. \n",name,dist);
        }
        return dist<=maxRun;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=maxJump){
            System.out.printf("The man %s was able to jump %s m. \n",name,dist);
        }else{
            System.out.printf("The man %s could not jump %s m. \n",name,dist);
        }
        return dist<=maxJump;
    }
}
