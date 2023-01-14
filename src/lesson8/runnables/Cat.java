package lesson8.runnables;

public class Cat implements Runnable {
    private String name;
    private final double MAX_JUMP = 3.0;
    private final double MAX_RUN = 100.0;


    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean run(double dist) {
        if (dist <= MAX_RUN) {
            System.out.printf("The cat %s was able to run %s m. \n", name, dist);
        } else {
            System.out.printf("The cat %s could not run %s m. \n", name, dist);
        }
        return dist <= MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if (dist <= MAX_JUMP) {
            System.out.printf("The cat %s was able to jump %s m. \n", name, dist);
        } else {
            System.out.printf("The cat %s could not jump %s m. \n", name, dist);
        }
        return dist <= MAX_JUMP;
    }
}
