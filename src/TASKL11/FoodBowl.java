package TASKL11;

public class FoodBowl {

    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        if (foodAmount <= 0) System.out.println("Illegal argument");
        this.foodAmount = foodAmount;
    }

    public void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }
}
