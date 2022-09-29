package school.lesson5.Task2FruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight() {
        return fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void changeFruits(Box<T> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruitToAdd) {
        fruits.add(fruitToAdd);
    }
}
