package school.lesson4.task1CatsDogs;

public class Dog extends Animal {
    private final int maxRun = 500;
    private final int maxSwim = 10;
    private static int dogTotal = 0;

    public static int getDogTotal() {
        return dogTotal;
    }

    public Dog(String name) {
        super(name);
        dogTotal++;
    }

    @Override
    public void swim(int distance) {

        if (distance <= maxSwim && distance > 0) {
            System.out.println(getName() + " swam " + distance + " m.");
        } else {
            System.out.println("Too much to swim.");
        }
    }

    public void run(int distance) {
        if (distance <= maxRun && distance > 0) {
            System.out.println(getName() + " ran " + distance + " m.");
        } else {
            System.out.println("Too much to run.");
        }
    }
}
