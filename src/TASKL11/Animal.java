package TASKL11;

public abstract class Animal {

    private static int animalsCount = 0;

    public Animal(){
        animalsCount ++;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);

}