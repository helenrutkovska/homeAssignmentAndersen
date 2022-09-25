package school.lesson4.task1CatsDogs;

public abstract class Animal {
    private String name;
    private int distance;
    private static int total = 0;

    public Animal(String name) {
        this.name = name;
        total++;
    }

    public void run() {
        System.out.println("The animal is running");
    }

    public void swim(int distance) {
        System.out.println("The animal is swimming");
    }

    public String getName() {
        return this.name;
    }

    public int getDistance() {
        return this.distance;
    }

    public static int getTotal() {
        return total;
    }
}
