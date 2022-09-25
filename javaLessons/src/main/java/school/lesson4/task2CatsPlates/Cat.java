package school.lesson4.task2CatsPlates;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Cat: " + name + '\n' +
                "Appetit: " + appetite + '\n' +
                "Full: " + isFull + '\n';
    }

    void eat(Plate plate) {
        if (plate.getFoodAmount() > appetite) {
            plate.deleteFood(appetite);
            isFull = true;
        } else {
            System.out.println("Cat " + name + " is hungry!");
        }
    }
}
