package school.lesson4.task2CatsPlates;

public class Plate {
    private int foodAmount;

    Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    void deleteFood(int appetite) {
        if (foodAmount >= appetite) {
            foodAmount -= appetite;
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    @Override
    public String toString() {
        return "The food we have in the plate: " + foodAmount;
    }
}
