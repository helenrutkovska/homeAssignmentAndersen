package school.lesson5.Task2FruitBox;

public class FruitBoxApp {
    public static void main(String[] args) {
        Box<Orange> boxWithOranges1 = new Box();
        Box<Orange> boxWithOranges2 = new Box();
        boxWithOranges1.addFruit(new Orange());
        boxWithOranges1.addFruit(new Orange());
        boxWithOranges1.addFruit(new Orange());
        boxWithOranges1.addFruit(new Orange());
        boxWithOranges2.addFruit(new Orange());
        boxWithOranges2.addFruit(new Orange());
        System.out.println("The first box with oranges: " + boxWithOranges1.getWeight());
        System.out.println("The second box with oranges: " + boxWithOranges2.getWeight());

        Box<Apple> boxWithApples1 = new Box();
        Box<Apple> boxWithApples2 = new Box();
        boxWithApples1.addFruit(new Apple());
        boxWithApples1.addFruit(new Apple());
        boxWithApples1.addFruit(new Apple());
        boxWithApples1.addFruit(new Apple());
        boxWithApples2.addFruit(new Apple());
        boxWithApples2.addFruit(new Apple());

        System.out.println("The first box with apples: " + boxWithApples1.getWeight());
        System.out.println("The second box with apples: " + boxWithApples2.getWeight());

        System.out.println("Compare the first box with oranges and apples: " + boxWithOranges1.compare(boxWithApples1));
        System.out.println("Compare the second box with oranges and apples: " + boxWithOranges2.compare(boxWithApples1));

        boxWithOranges1.changeFruits(boxWithOranges2);

        System.out.println("The first box after exchanging the fruits: " + boxWithOranges1.getWeight());
        System.out.println("The second box after exchanging the fruits: " + boxWithOranges2.getWeight());
    }
}
