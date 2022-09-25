package school.lesson4.task1CatsDogs;

public class Cat extends Animal {
    private final int maxRun = 200;
    private static int catTotal = 0;

    public Cat(String name) {
        super(name);
        catTotal++;
    }

    public static int getCatTotal() {
        return catTotal;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim.");
    }

    public void run(int distance) {
        if (distance <= maxRun && distance > 0) {
            System.out.println(getName() + " ran " + distance + " m.");
        } else {
            System.out.println("Too much to run.");
        }
    }
}
