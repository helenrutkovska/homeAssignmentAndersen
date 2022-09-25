package school.lesson4.task1CatsDogs;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Bo");
        Cat cat3 = new Cat("Miss");
        cat1.run(200);
        cat1.swim(1);
        cat2.run(70);

        Dog dog1 = new Dog("Max");
        Dog dog2 = new Dog("Oscar");
        Dog dog3 = new Dog("Buddy");
        Dog dog4 = new Dog("Lucky");
        dog1.run(200);
        dog1.swim(12);
        dog3.run(500);
        dog3.swim(8);

        System.out.println("Total number of animals: " + Animal.getTotal());
        System.out.println("Total number of cats: " + Cat.getCatTotal());
        System.out.println("Total number of dogs: " + Dog.getDogTotal());
    }
}
