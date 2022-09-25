package school.lesson4.task2CatsPlates;

public class CatsPlatesApp {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Pinky", 15), new Cat("Rosie", 2)};
        Plate plate = new Plate(10);
        System.out.println("The cats we have:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("\n" + plate);
        System.out.println("Time to feed the cats we have:");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
        System.out.println("Add more food");
        plate.addFood(20);
        System.out.println(plate);
    }
}
