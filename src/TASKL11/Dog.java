package TASKL11;

public class Dog extends Animal  {

    private static int dogCount = 0;

    public Dog(){
        dogCount++;
    }
    @Override
    public void run(int distance){
        if (distance >= 0 && distance <= 500){
            System.out.println("dog run" + distance + "m");
        } else System.out.println("the dog can't ruт");

    }

    @Override
    public void swim(int distance){
        if(distance >= 0 && distance <= 10 ){
            System.out.println("dog can swim" + distance + "m");
        } else System.out.println("the dog can't swim");
    }
}
