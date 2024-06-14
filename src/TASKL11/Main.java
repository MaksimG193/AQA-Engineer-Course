package TASKL11;

public class Main {

    public static void main(String[] args) {

        Dog sharik = new Dog();
        Dog baron = new Dog();

        sharik.run(150);
        sharik.swim(15);

        baron.run(600);
        baron.swim(7);

        Cat simba = new Cat();
        Cat janis = new Cat();
        Cat tom = new Cat();

        simba.run(150);
        simba.swim(20);

        FoodBowl bowl = new FoodBowl(1);
        bowl.addFood(20);

        Cat[] catsArray = {simba, janis, tom};

        for (Cat cat : catsArray) {
            cat.eatFromBowl(bowl, 9);
            System.out.println(cat.satiety);
        }
    }
}
